package Test2

import org.scalatest.FunSuite

class CompositionTest extends FunSuite {

  test("testCompose: compose functions") {
    assert(Compositions.testCompose((i:Int) => "Word" * i)((i: String) => i * 2)
    ((i:String) => i.dropRight(3))(2) == "WordWordWordW")
  }

  test("testFlatMap: test FlatMap") {
    assert(Compositions.testMapFlatMap((i: Int) => if (i > 0) Some(i) else None)
    ((i: Int) => if (i > 10) Some(i) else None)
    ((i: Int) => i * 2)(Some(-1)).isEmpty)
  }

  test("testForComprehension: ") {
    assert(Compositions.testForComprehension((i: Int) => if (i > 0) Some(i) else None)
    ((i: Int) => if (i > 10) Some(i) else None)
    ((i: Int) => i * 2)(Some(11)).contains(22))
  }

}
