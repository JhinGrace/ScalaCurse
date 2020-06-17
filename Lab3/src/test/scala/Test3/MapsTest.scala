package Test3

import org.scalatest.FunSuite
import Maps._

class MapsTest extends FunSuite {
  val John = User("John", 20)
  val Bill = User("Bill", 30)
  val Donovan = User("Donovan", 40)

  val map = Map("John" -> John, "Bill" -> Bill, "Donovan" -> Donovan)
  val seq = Seq(John, Bill, Donovan)

  test("testGroupUsers: group by name and get mean of age") {
    assert(testGroupUsers(seq) == Map("John" -> 20, "Bill" -> 30, "Donovan" -> 40))
  }

  test("testNumberFrodos: amount of Adams in sequance") {
    assert(testNumberFrodos(Map("John" -> John, "Adam" -> User("Adam", 20))) == 1)
  }

  test("testUnderaged: delete anyone under 35 years") {
    assert(testUnderaged(map) == Map("Donovan" -> Donovan))
  }

}
