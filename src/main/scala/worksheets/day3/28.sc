import scala.util.control.NonFatal

try 1/ 0 catch {
//  case x: ArithmeticException   ⇒ 99
  case x: NumberFormatException ⇒ 99
  case NonFatal(ex)                 ⇒ ex.getMessage
}

List(10).map(_ + 9)
List.empty[Int].map(_ + 9)

Some(10)
None

Option(10)
Option.empty[Int]

Option(10).map(_ + 9)
Option.empty[Int].map(_ + 9)

def m(x: Any) = x match {
  case 1 ⇒ 1
  case a: String ⇒ a.length
  case a: Array[Int] ⇒ a.sum
}

m(1)
m("asdads")
m(Array(1, 2, 3, 4))
m(0.9)
