
sealed trait Day
object Day {
  case object Weekday extends Day
  case object Weekend extends Day
}

sealed trait Customer
object Customer {
  case object Regular extends Customer
  case object Rewards extends Customer
}

case class Category(customer: Customer, day: Day)

case class BookingRequest(customer: Customer, days: List[Day]) {
  def categories: List[Category] = days.map(day ⇒ Category(customer, day))
}

case class Hotel(name: String, rating: Int, rates: Map[Category, Int]) {
  def getPrice(bookingRequest: BookingRequest): Int =
    bookingRequest.categories.map(rates).sum
}

class HotelRepo(hotels: Hotel*) {
  def searchBestHotel(bookingRequest: BookingRequest): Hotel =
    hotels.minBy(hotel ⇒ hotel.getPrice(bookingRequest))
}
