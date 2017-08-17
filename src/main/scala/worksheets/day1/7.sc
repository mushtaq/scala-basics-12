import data.Book
import data.Data._

books.foreach(println)

books.map(book ⇒ book.basePrice)
books.map(_.basePrice)
books.map(_.basePrice).sum

books.foldLeft(0.0)((total, book) ⇒ total + book.basePrice)

books.filter(_.author == "odersky").foreach(println)

books
  .groupBy(_.author)
  .mapValues(books ⇒ books.map(_.basePrice).sum)

books.sortBy(-_.basePrice)
books.maxBy(-_.basePrice)

