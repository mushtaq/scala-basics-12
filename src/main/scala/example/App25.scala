package example

import example.Meter.RichInt

object App25 extends App {

  println(10.m + 30.m)
//  println(10: Meter)

  def m(xs: Seq[Int]) = xs.length

  println(m(List(1, 2, 34)))
  println(m(Array(1, 2, 34)))
}
