package Test2

import org.scalatest.FunSuite

class RecursiveDataTest extends FunSuite{

  test("testListIntEmpty: check if empty") {
    assert(RecursiveData.testListIntEmpty(Nil))
    assert(!RecursiveData.testListIntEmpty(List(1, 2, 3)))
  }

  test("testListIntHead: return first element or -1 if empty") {
    assert(RecursiveData.testListIntHead(List(1, 2, 3)) == 1)
    assert(RecursiveData.testListIntHead(Nil) == -1)
  }

  test("ListNotEmpty: add element if empty") {
    assert(RecursiveData.ListNotEmpty(1, Nil) == List(1))
    assert(RecursiveData.ListNotEmpty(1, List(1, 2, 3)) == List(1, 2, 3))
  }

}
