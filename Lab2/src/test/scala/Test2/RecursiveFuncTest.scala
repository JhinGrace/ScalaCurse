package Test2

import org.scalatest.FunSuite

import scala.collection.immutable.List

class RecursiveFuncTest extends FunSuite {

  test("length: length of list") {
    assert(RecursiveFunc.length(List(1, 2, 3)) == 3)
  }

  test("testReverse: reverse list") {
    assert(RecursiveFunc.testReverse(List(1, 2, 3)) == List(3, 2, 1))
  }

  test("testMap: function to every member of the list") {
    assert(RecursiveFunc.testMap(List(1, 2, 3), (x: Int) => x * 2) == List(2, 4, 6))
  }

  test("testAppend: concatenate two lists") {
    assert(RecursiveFunc.testAppend(List(1, 2, 3), List(4, 5, 6)) == List(1, 2, 3, 4, 5, 6))
  }

  test("testFlatMap: function to every member of the list") {
    assert(RecursiveFunc.testFlatMap(List(1,2,3), (x:Int) => List.range(1, x)) == List(List(),List(1),List(1,2)))
  }
}
