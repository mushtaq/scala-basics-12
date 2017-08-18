package s

trait Ord[T] {
  def lt(a: T, b: T): Boolean
}

