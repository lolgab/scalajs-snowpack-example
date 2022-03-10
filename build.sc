import $file.project.versions
import $file.project.scalablytyped
import mill._
import mill.define.Task
import mill.scalalib._
import mill.scalajslib._
import mill.scalajslib.api._

object chart extends ScalaJSModule {
  def scalaVersion = "3.1.1"
  def scalaJSVersion = "1.9.0"
  def moduleKind = ModuleKind.ESModule
  def moduleDeps = Seq(scalablytyped.module)
  def ivyDeps = Agg(
    ivy"com.raquo::laminar::0.14.2"
  )
  private def public(dev: Boolean): Task[Map[String, String]] = {
    val js = if (dev) fastOpt else fullOpt
    T.task {
      val dest = T.dest
      val jsDir = js().path / os.up
      os.list(jsDir).foreach { file =>
        os.move(file, dest / file.last)
      }
      val mounts = Map(
        dest -> "/",
        os.pwd / "public" -> "/"
      )
      mounts.map { case (k, v) =>
        k.relativeTo(os.pwd).toString -> v
      }
    }
  }
  def publicDev = T {
    public(dev = true)()
  }
  def publicProd = T {
    public(dev = false)()
  }
  def buildProd = T {
    publicProd()
    os.proc("npm", "run", "build").call()
  }
}
