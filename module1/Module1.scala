object Module1:
  export Exportee.*

object Exportee:
  def method(param: String = "defaultValue"): Unit = ???