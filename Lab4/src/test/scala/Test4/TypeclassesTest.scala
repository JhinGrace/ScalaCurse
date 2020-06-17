package Test4

import org.scalatest.FunSuite

class TypeclassesTest extends FunSuite {

  test("testReversableString: reverse string") {
    assert(Typeclasses.testReversableString("word") == "drow")
  }

  test("testSmashInt: add numbers to each other") {
    assert(Typeclasses.testSmashInt(10, 5) == 15)
  }

  test("testSmashDouble: if numbers are double them multiply them") {
    assert(Typeclasses.testSmashDouble(10.0, 5.0) == 50.0)
  }

  test("testSmashString: concatenate two strings") {
    assert(Typeclasses.testSmashString("Word", "droW") == "WorddroW")
  }
}
