package s

object Test extends App {

  println(S.sort(List(11, 3, 56, 8))(Ord.intOrd))
  println(S.sort(List("z", "a", "m"))(Ord.strOrd))
  println(S.sort(List(Some(11), None, Some(3)))(Ord.optOrd(Ord.intOrd)))
  println(S.sort(List(Some("z"), None, Some("a")))(Ord.optOrd(Ord.strOrd)))
  println(S.sort(List((54, "z"), (10, "z"), (10, "m")))(Ord.pairOrd(Ord.intOrd, Ord.strOrd)))
  println(S.sort(List((Some(54), Some("z")), (Some(10), Some("z")), (Some(10), None)))())

}
