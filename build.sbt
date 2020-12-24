import scala.sys.process.Process

scalaVersion := "2.13.4"

enablePlugins(ScalaJSPlugin)

scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) }

scalaJSUseMainModuleInitializer := true

enablePlugins(ScalablyTypedConverterExternalNpmPlugin)

externalNpm := {
  Process("npm", baseDirectory.value).!
  baseDirectory.value
}

libraryDependencies += "com.raquo" %%% "laminar" % "0.11.0"
