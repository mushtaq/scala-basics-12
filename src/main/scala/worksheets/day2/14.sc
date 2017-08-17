
sealed trait Day
object Day {
  case object Sunday extends Day
  case object Monday extends Day
  case object Tuesday extends Day
  case object Wednesday extends Day
  case object Thursday extends Day
  case object Friday extends Day
  case object Saturday extends Day
}

Day.Sunday: Day.Sunday.type
Day.Sunday: Day

val x = "abc"
x: String
x: x.type

val y = "abc"
y: String
y: y.type
y: x.type


