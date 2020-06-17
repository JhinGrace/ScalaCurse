package Test3

import org.scalatest.FunSuite

class SequenceTest extends FunSuite {

  test("testLastElement: last element of sequance") {
    assert(Sequence.testLastElement(Seq(1, 2, 3)) == Some(3))
  }

  test("testZip: zip-combo of two sequances") {
    assert(Sequence.testZip(Seq(1, 2), Seq(3, 4)) == Seq((1, 3), (2, 4)))
  }

  test("testForAll: test every element") {
    assert(Sequence.testForAll(Seq(1, 2, 3))((x: Int) => x != 10) == true)
  }

  test("testPalindrom: check if palindrome") {
    assert(Sequence.testPalindrome(Seq(1, 2, 3)) == false)
    assert(Sequence.testPalindrome(Seq(1, 2, 3, 2, 1)) == true)
  }

  test("testFlatMap: use function on every element") {
    assert(Sequence.testFlatMap(Seq(1, 2, 3, 4))((x: Int) => Seq.range(1, x)) == Seq(1, 1, 2, 1, 2, 3))
  }
}
