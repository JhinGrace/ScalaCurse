package Test1
import org.scalatest.FunSuite

class FunctionsTest extends FunSuite {
  test("testCircle calculates area of a circle")  {
    assert(Functions.testCircle(5) == 5 * 5 * Math.PI)
  }

  test("testRectangleCurried calculates an area of a curried rectangle")  {
    assert(Functions.testRectangleCurried(5, 10) == 50)
  }

  test("testRectangleUc calculates an area of a uncurried rectangle")  {
    assert(Functions.testRectangleUc(5, 10) == 50)
  }
}
