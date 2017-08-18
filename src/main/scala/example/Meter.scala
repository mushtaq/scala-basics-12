package example

case class Meter(value: Int) extends AnyVal {
  def +(other: Meter): Meter = Meter(value + other.value)
}

object Meter {
//  implicit def fromInt(x: Int): Meter = Meter(x)
//  implicit def fromInt2(x: Int): Meter = Meter(x)
  implicit class RichInt(val x: Int) extends AnyVal {
    def m: Meter = Meter(x)
  }

  implicit val default: Meter = Meter(100)
}
