
val divide100: PartialFunction[Int, Int] = {
  case 1 ⇒ 100
}

val divide100a: PartialFunction[Int, Int] = {
  case 2 ⇒ 50
}

val pf2 = divide100.orElse(divide100a)
pf2.isDefinedAt(1)
pf2.isDefinedAt(2)
pf2.isDefinedAt(3)

divide100(10)
divide100.isDefinedAt(8999)
divide100.isDefinedAt(8)
divide100.isDefinedAt(0)

import data.Book
import data.Data._

val pf: PartialFunction[Book, Double] = {
  case Book("odersky", _, basePrice) ⇒ basePrice
}

books.filter(_.author == "odersky").map(_.basePrice)
books.filter(pf.isDefinedAt).map(pf)
books.collect {
  case Book("odersky", _, basePrice) ⇒ basePrice
}
