val m = Map(1 → "a", 2 → "b")

m(1)
m(2)

m.get(1)
m.get(2)
m.get(20)

Seq(1, 2, 3)

sealed trait Option[T]
case class Some[T](value: T) extends Option[T]
case class None[T]() extends Option[T]

def make[T](x: T): Option[T] =
  if(x == null) None[T]() else Some(x)

make("asdasd")
make[String](null)

