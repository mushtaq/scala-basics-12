import scala.annotation.tailrec

val as = List(1, 2, 3)
val bs = 0 :: as
val cs = -1 :: bs

cs.head
cs.tail
cs.tail.tail

1 :: 2 :: 3 :: Nil


def map[T, S](xs: List[T])(f: T ⇒ S): List[S] = {
  if(xs.isEmpty) Nil else f(xs.head) :: map(xs.tail)(f)
}


def map3[T, S](xs: List[T])(f: T ⇒ S): List[S] = {
  @tailrec
  def map2(rem: List[T], acc: List[S]): List[S] = {
    if(rem.isEmpty) acc else map2(rem.tail, f(rem.head) :: acc)
  }
  map2(xs, Nil).reverse
}

map3((1 to 10000).toList)(x ⇒ x + 1)
