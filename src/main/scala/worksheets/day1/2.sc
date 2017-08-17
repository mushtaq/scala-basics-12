import scala.collection.mutable

def square(xs: List[Int]): List[Int] = {
  val it = xs.iterator
  val buffer = mutable.Buffer.empty[Int]
  while (it.hasNext) {
    val elm = it.next()
    buffer += (elm * elm)
  }
  buffer.toList
}

square(List(1, 2, 3, 4))

def increment(xs: List[Int]): List[Int] = {
  val it = xs.iterator
  val buffer = mutable.Buffer.empty[Int]
  while (it.hasNext) {
    val elm = it.next()
    buffer += (elm + 1)
  }
  buffer.toList
}

increment(List(2, 3, 4, 5))
