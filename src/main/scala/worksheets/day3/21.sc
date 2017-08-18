
val t = (1, "a")

val (k, v) = t

class Person(val name: String, val age: Int)
object Person123 {
  def apply(name: String, age: Int): Person =
    new Person(name, age)
  def unapply(p: Person): Option[(String, Int)] =
    Some((p.name, p.age))
}

val p = Person123("abc", 33)
val Person123(name, age) = p
