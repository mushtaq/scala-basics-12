//
//sealed trait List[T]
//case class Nil[T]() extends List[T]
//case class ::[T](head: T, tail: List[T]) extends List[T]

0 :: List(1, 2, 3)

def length[T](xs: List[T]): Int = xs match {
  case Nil ⇒ 0
  //  case ::(head, tail) ⇒ 1 + length(tail)
  case head :: tail ⇒ 1 + length(tail)
}


length(List(1, 2, 3, 4))

def reverse[T](xs: List[T]): List[T] = {
  def inner(rem: List[T], acc: List[T]): List[T] = rem match {
    case Nil ⇒ acc
    case head :: tail ⇒ inner(tail, head :: acc)
  }
  inner(xs, Nil)
}

reverse(List(1, 2, 3, 4))
