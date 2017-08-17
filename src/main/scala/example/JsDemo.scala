package example

import play.api.libs.json._

object JsDemo {
  def transform(json: JsValue): JsValue = json match {
    case JsNumber(value)                             ⇒ JsNumber(value * value)
    case JsArray(values)                             ⇒ JsArray(values.map(transform))
    case JsObject(values)                            ⇒ JsObject(values.mapValues(transform))
    case JsString(value) if value.startsWith("urn:") ⇒ JsString("hello " + value.stripPrefix("urn:"))
    case _                                           ⇒ json
  }
}
