package Test1

import org.scalatest.FunSuite

class HiOrderTest extends FunSuite {

  test("Test if multiplies correctly") {
    assert(HiOrder.testNTimes((a: Int, b: Int) => a + b,  5, 10, 4)  == 60)
  }

  test("testAnonymousNTimes calls nTimes with given parameters and hardcoded function") {
    assert(HiOrder.testAnonymousNTimes(5, 10, 4)  == 40)
    assert(HiOrder.testAnonymousNTimes(10, 5, 4)  == 40)
  }
}
