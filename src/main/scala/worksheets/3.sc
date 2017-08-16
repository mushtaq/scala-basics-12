import scala.collection.mutable

0 :: List(1, 2, 3)
var xs = List(1, 2, 3)
xs = 0 :: xs
xs.reverse

def perform(xs: List[Int], f: (Int) ⇒ Int): List[Int] = {
  val it = xs.iterator
  val buffer = mutable.Buffer.empty[Int]
  while (it.hasNext) {
    buffer += f(it.next())
  }
  buffer.toList
}

def square(xs: List[Int]): List[Int] = {
  val sqr: (Int) ⇒ Int = (x: Int) ⇒ x * x
  perform(xs, sqr)
}

def increment(xs: List[Int]): List[Int] = perform(xs, x ⇒ x + 1)
