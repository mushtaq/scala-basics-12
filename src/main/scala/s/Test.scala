package s

object Test extends App {

  println(S.sort(List(11, 3, 56, 8))(Ord.intOrd))
  println(S.sort(List("z", "a", "m"))(Ord.strOrd))
  println(S.sort(List(Some(11), None, Some(3)))(Ord.intOrd))

}
