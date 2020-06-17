package Test3

import org.scalatest.FunSuite

class AdtsTest extends FunSuite{

  test("testGetNth: n-th element of the list") {
    assert(Adts.testGetNth(List(1, 2, 3), 2) == Some(3))
  }

  test("testDouble: doubles the number") {
    assert(Adts.testDouble(Some(3)) == Some(6))
    assert(Adts.testDouble(None) == None)
  }

  test("testIsEven: return number if even and message if not") {
    assert(Adts.testIsEven(2) == Right(2))
    assert(Adts.testIsEven(1) == Left("Not even"))
  }

  test("testSafeDivide: divide by anything but zero") {
    assert(Adts.testSafeDivide(2, 2) == Right(1))
    assert(Adts.testSafeDivide(2, 0) == Left("You can't divide by zero"))
  }

  def pureFunc(str: String): Int = {
    2
  }

  test("testGoodOldJava: return Try[Int]") {
    assert(Adts.testGoodOldJava(pureFunc, "Hello, world!") == util.Success(2))
  }
}
