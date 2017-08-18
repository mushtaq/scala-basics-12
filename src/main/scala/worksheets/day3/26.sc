
trait Person {
  def name: String
  def age: Int

  def isAdult: Boolean = age > 18
}

case class Student(name: String, age: Int, rollN: Int) extends Person
case class Employee(name: String, age: Int, empId: Int) extends Person


val student = Student("st1", 11, 100)
val employee = Employee("emp1", 41, 100)


student.isAdult
employee.isAdult
