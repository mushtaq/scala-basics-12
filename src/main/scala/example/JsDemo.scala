package example

import play.api.libs.json._

object JsDemo {
  def transform(json: JsValue): JsValue = json match {
    case JsNumber(value)           ⇒ JsNumber(value * value)
    case JsArray(values)           ⇒ JsArray(values.map(transform))
    case JsObject(values)          ⇒ JsObject(
      values.map {
        case (k@("m" | "n"), v) ⇒ (k, v)
        case (k, v)             ⇒ (k, transform(v))
      }
    )
    case JsString("urn" :: suffix) ⇒ JsString(s"Hello $suffix")
    case _                         ⇒ json
  }
}

object :: {
  def unapply(s: String): Option[(String, String)] = s.split(":") match {
    case Array(prefix, suffix) ⇒ Some((prefix, suffix))
    case _                     ⇒ None
  }
}
