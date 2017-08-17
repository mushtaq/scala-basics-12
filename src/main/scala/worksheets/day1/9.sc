import data.AliceData

val words = AliceData.bookText.split(AliceData.bookRegex)
val stopWords = AliceData.stopWordText.split(AliceData.stopWordRegex).toSet

words
  .filterNot(stopWords)
  .groupBy(identity)
  .mapValues(_.length)
  .toList
  .sortBy(t ⇒ -t._2)
  .take(5)
  .foreach(println)

val tuple: (Int, String) = (1, "a")

tuple._2

