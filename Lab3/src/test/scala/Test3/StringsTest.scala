package Test3

import org.scalatest.FunSuite

class StringsTest extends FunSuite {

  test("testUppercase: word to uppercase") {
    assert(Strings.testUppercase("word") == "WORD")
  }

  test("testInterpolation: put name and age into template") {
    assert(Strings.testInterpolations("John", 20) == "Hi, my name is John and I am 20 years old.")
  }

  test("testComputation: put numbers into template") {
    assert(Strings.testComputation(10, 5) == "Hi,\n" +
      "now follows a quite hard calculation. We try to add:\n" +
      s"  a := 10\n" +
      s"  b := 5\n\n" +
      s"  result is 10 + 5")
  }

  test("testTakeTwo: first two characters of the string") {
    assert(Strings.testTakeTwo("Word") ==  "Wo")
  }
}
