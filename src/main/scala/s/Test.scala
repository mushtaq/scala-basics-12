package s

object Test extends App {

  println(S.sort(List(11, 3, 56, 8)))
  println(S.sort(List("z", "a", "m")))
  println(S.sort(List(Some(11), None, Some(3))))
  println(S.sort(List(Some("z"), None, Some("a"))))

  println(S.sort(List((54, "z"), (10, "z"), (10, "m"))))

  {
    implicit val intOrd: Ord[Int] = (a: Int, b: Int) => a > b
    println(S.sort(List((Some(12), Some("z")), (Some(10), None), (None, Some("z")))))
  }

  println(S.sort(data.Data.books))

}
