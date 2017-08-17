
sealed trait Json
//sealed class JBoolean(value: Boolean) extends Json
sealed trait JBoolean extends Json {
  def value: Boolean
}
case object JTrue extends JBoolean {
  override def value = true
}
case object JFalse extends JBoolean {
  override def value = false
}
case class JNumber(value: Double) extends Json
case class JString(value: String) extends Json
case object JNull extends Json
case class JArray(values: List[Json]) extends Json
case class JObject(values: Map[String, Json]) extends Json


