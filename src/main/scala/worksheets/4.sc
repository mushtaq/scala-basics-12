
def sum(xs:List[Int]): Int = {
  var total = 0
  val iterator = xs.iterator
  while (iterator.hasNext) {
    total = total + iterator.next()
  }
  total
}


sum(List(1, 2, 3, 4))

def product(xs:List[Int]): Int = {
  var total = 1
  val iterator = xs.iterator
  while (iterator.hasNext) {
    total = total * iterator.next()
  }
  total
}


def perform[Result, Elm](xs: List[Elm], seed: Result)(op: (Result, Elm) ⇒ Result): Result = {
  var total = seed
  val iterator = xs.iterator
  while (iterator.hasNext) {
    total = op(total, iterator.next())
  }
  total
}

def sum2(xs: List[Int]): Int = perform(xs, 0) {
  (total, value) => total + value
}

sum2(List(10, 20))

def stringify[T](xs: List[T]): String = perform(xs, "") {
  (result, elm) => result + elm
}

stringify(List(1, 2, 3, 4, 5))
stringify(List("a", "b"))
