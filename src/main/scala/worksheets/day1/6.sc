
import data.Data._

def square(x: Int): Int = x * x

square(10)

val squareF: Int ⇒ Int = x ⇒ x * x

squareF(10)
squareF.apply(10)

val xs = List(1, 2, 3)

xs.map(x ⇒ x * x)
xs.map(x ⇒ square(x))
xs.map(x ⇒ squareF(x))
xs.map(squareF)
xs.map(square)

