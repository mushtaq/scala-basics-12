package data

import scala.io.Source

object AliceData {
  val bookText = Source.fromFile("/Users/mushtaq/projects/workshops/scala-basics-11/src/main/resources/aliceInWonderland.txt").mkString.toLowerCase
  val stopWordText = Source.fromFile("/Users/mushtaq/projects/workshops/scala-basics-11/src/main/resources/stopWords.txt").mkString.toLowerCase

  val bookRegex = """[\s|:|.|,|\d|"]+"""
  val stopWordRegex = "\\s+"
}
