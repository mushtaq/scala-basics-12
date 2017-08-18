package s

object S {

  def insert[T](x: T, xs: List[T]): List[T] = xs match {
    case Nil                      ⇒ List(x)
    case head :: tail if x < head ⇒ x :: xs
    case head :: tail             ⇒ head :: insert(x, tail)
  }

  def sort[T](xs: List[T]): List[T] = xs match {
    case Nil          ⇒ Nil
    case head :: tail ⇒ insert(head, sort(tail))
  }

}
