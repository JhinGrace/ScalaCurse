package Test1

import org.scalatest.FunSuite

class PatternsTest extends FunSuite {
  test("IntToString converts numbers from 1 to 3 to String") {
    assert(PatternMatching.testIntToString(1) == "it is one")
    assert(PatternMatching.testIntToString(2) == "it is two")
    assert(PatternMatching.testIntToString(3) == "it is three")
    assert(PatternMatching.testIntToString(4) == "what's that")
  }

  test("Test if Max or Moritz") {
    assert(PatternMatching.testIsMaxAndMoritz("max") &&
          PatternMatching.testIsMaxAndMoritz("Max") &&
          PatternMatching.testIsMaxAndMoritz("moritz") &&
          PatternMatching.testIsMaxAndMoritz("Moritz"))

    assert(!PatternMatching.testIsMaxAndMoritz("mike"))
  }

  test("Check if even") {
    assert(!PatternMatching.testIsEven(1))
    assert(PatternMatching.testIsEven(2))
  }

  test("Check if wins at rock-paper-scissors game") {
    assert(PatternMatching.testWinsA(PatternMatching.Rock, PatternMatching.Scissors)  == PatternMatching.Win)
    assert(PatternMatching.testWinsA(PatternMatching.Paper, PatternMatching.Rock)  == PatternMatching.Win)
    assert(PatternMatching.testWinsA(PatternMatching.Scissors, PatternMatching.Paper)  == PatternMatching.Win)
    assert(PatternMatching.testWinsA(PatternMatching.Paper, PatternMatching.Scissors)  == PatternMatching.Lose)
    assert(PatternMatching.testWinsA(PatternMatching.Paper, PatternMatching.Paper)  == PatternMatching.Draw)
  }

  test("If mammal then return its weight, else -1") {
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("cow", PatternMatching.Vegetables, 100))  == 100)
    assert(PatternMatching.testExtractMammalWeight(PatternMatching.Fish("goldfish", PatternMatching.Vegetables))  == -1)
  }

  test("Changes food of an animal") {
    val goldfish = PatternMatching.Fish("goldfish", PatternMatching.Vegetables)
    PatternMatching.testUpdateFood(goldfish)
    assert(goldfish.food  == PatternMatching.Plants)
  }
}
