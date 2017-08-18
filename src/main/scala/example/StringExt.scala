package example

object StringExt {

  implicit class RichString(val string: String) extends AnyVal {
    def hello = s"Hello $string"
  }

}
