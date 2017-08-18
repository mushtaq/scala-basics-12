package s

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

object Ord {
  val intOrd: Ord[Int] = (a: Int, b: Int) => a < b

  val strOrd: Ord[String] = (a: String, b: String) => a < b
}
