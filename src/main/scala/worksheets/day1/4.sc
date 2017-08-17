
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


def fold[Result, Elm](xs: List[Elm], seed: Result)(op: (Result, Elm) ⇒ Result): Result = {
  var total = seed
  val iterator = xs.iterator
  while (iterator.hasNext) {
    total = op(total, iterator.next())
  }
  total
}

def sum2(xs: List[Int]): Int = fold(xs, 0) {
  (total, value) => total + value
}

def map[T, S](xs: List[T])(f: T ⇒ S): List[S] = {
  fold(xs, List.empty[S])((acc, elm) ⇒ f(elm) :: acc).reverse
}

def reverse[T](xs: List[T]): List[T] = {
  fold(xs, List.empty[T])((acc, elm) ⇒ elm :: acc)
}

sum2(List(10, 20))

def stringify[T](xs: List[T]): String = fold(xs, "") {
  (result, elm) => result + elm
}

stringify(List(1, 2, 3, 4, 5))
stringify(List("a", "b"))
