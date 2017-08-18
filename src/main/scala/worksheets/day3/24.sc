
val xs = List(2, 3, 1, 5, 6)

xs.sorted

import data.Data._

books.sortBy(_.basePrice).foreach(println)

books
  .sortBy(book ⇒ (book.basePrice, book.title))
  .foreach(println)


