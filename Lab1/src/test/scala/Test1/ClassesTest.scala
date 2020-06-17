package Test1

import org.scalatest.FunSuite

class ClassesTest extends FunSuite {

  test("If parameter is valid apply creates animal") {
    assert(Animal.apply("cat") == (Some(Animal.cat)))
    assert(Animal.apply("parrot") == (Some(Animal.parrot)))
    assert(Animal.apply("goldfish") == (Some(Animal.goldfish)))
  }

  test("If wrong parameter is passed apply returns None") {
    assert(Animal.apply("wrongParam").isEmpty)
  }

  test("If animal is valid knownAnimal returns True") {
    assert(Animal.knownAnimal("cat") && Animal.knownAnimal("parrot") &&
        Animal.knownAnimal("goldfish"))
  }

  test("knownAnimal return False if animal is invalid") {
    assert(!Animal.knownAnimal("tiger"))
  }

  test("eats checks if animal eat the food") {
    val lion = Mammals("lion", "meat")
    assert(lion.eats("meat"))
    assert(!lion.eats("plants"))
  }
}