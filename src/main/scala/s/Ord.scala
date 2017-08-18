package s

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

object Ord {

  def apply[T](implicit x: Ord[T]): Ord[T] = x

  implicit val intOrd: Ord[Int] = (a: Int, b: Int) => a < b

  implicit val strOrd: Ord[String] = (a: String, b: String) => a < b

  implicit def optOrd[T: Ord]: Ord[Option[T]] = (a: Option[T], b: Option[T]) => (a, b) match {
    case (Some(x), Some(y)) ⇒ Ord[T].lt(x, y)
    case (None, _)          ⇒ true
    case (_, None)          ⇒ false
  }

  implicit def pairOrd[T1: Ord, T2: Ord]: Ord[(T1, T2)] = (a: (T1, T2), b: (T1, T2)) => {
    if (Ord[T1].lt(a._1, b._1)) true
    else if (Ord[T1].lt(b._1, a._1)) false
    else Ord[T2].lt(a._2, b._2)
  }
}
