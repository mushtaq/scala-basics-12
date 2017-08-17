
def merge(a: Option[String], b: Option[String]): Option[String] = {
  if (a == None) b
  else if (b == None) a
  else {
    val x = a.asInstanceOf[Some[String]].value
    val y = b.asInstanceOf[Some[String]].value
    Some(x + y)
  }
}

def merge2(a: Option[String], b: Option[String]): Option[String] = {
  (a, b) match {
    case (Some(x), Some(y)) ⇒ Some(x + y)
    case (None, _)          ⇒ b
    case (_, None)          ⇒ a
  }

}
