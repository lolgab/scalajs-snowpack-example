// We need this workaround because ScalablyTyped generates the imports
// with JSImport.Namespace and it doesn't find the library.
@js.native
@JSImport("chart.js", JSImport.Default)
class Chart(ctx: js.Dynamic, options: ChartConfiguration) extends js.Object

object Chart {
  def apply(
      ctx: js.Dynamic,
      chartConfiguration: ChartConfiguration
  ): typings.chartJs.mod.Chart =
    new Chart(
      ctx,
      chartConfiguration
    ).asInstanceOf[typings.chartJs.mod.Chart]
}
