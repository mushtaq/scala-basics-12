package example


object App26 extends App {


  def print(implicit x: String): Unit = {
    println(x)
  }

  def printM(implicit x: Meter): Unit = {
    println(s"${x.value} meters")
  }

  implicit val x: String = "he he he"

  print
  printM
}
