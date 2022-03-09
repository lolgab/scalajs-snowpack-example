import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("chart.js", JSImport.Namespace)
object ChartJS extends js.Object

val chart = ChartJS.asInstanceOf[js.Dynamic]
