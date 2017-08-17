
case class Person(name: String, age: Int) {
  def isAdult = age > 18
}



val p = Person("abc", 33)
val p2 = new Person("abc", 33)

p.isAdult

p == p2
p eq p2

p.hashCode()
p2.hashCode()

p.name

new Person("newName", p.age)

p.copy()
p.copy(age = 34)
p.copy(name = "balasd")


