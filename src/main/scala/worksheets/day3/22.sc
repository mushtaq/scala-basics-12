
val email = "mushtaq@thoughtworks.com"

object Email {
  def unapply(s: String): Option[(String, String)] = s.split("@") match {
    case Array(user, domain) ⇒ Some((user, domain))
    case _                   ⇒ None
  }
}

def m(s: String) = s match {
  case Email(user, domain) ⇒ println(s"Hello $user from $domain")
  case _                   ⇒ println("error")
}

m(email)
m("asdasd")
