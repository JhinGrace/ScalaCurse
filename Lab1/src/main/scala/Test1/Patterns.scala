package Test1

object PatternMatching extends App{

  sealed trait Hand
  case object Rock    extends Hand
  case object Paper   extends Hand
  case object Scissors extends Hand

  sealed trait Result
  case object Win  extends Result
  case object Lose extends Result
  case object Draw extends Result

  sealed trait Food
  case object Meat       extends Food
  case object Vegetables extends Food
  case object Plants     extends Food

  sealed trait Animal {

    val name: String
    var food: Food
  }
  case class Mammal(name: String, var food: Food, weight: Int) extends Animal
  case class Fish(name: String, var food: Food)                extends Animal
  case class Bird(name: String, var food: Food)                extends Animal

  def IntToString(value: Int): String =value match {
    case 1 => "it is one"
    case 2 => "it is two"
    case 3 => "it is three"
    case _ => "what's that"
  }

  def testIntToString(value: Int): String = IntToString(value)

def IsMaxAndMoritz(value: String): Boolean = value match {
  case "max" | "Max" | "moritz" | "Moritz" => true
  case _ => false
}

  def testIsMaxAndMoritz(value: String): Boolean = IsMaxAndMoritz(value)

def IsEven(value: Int): Boolean = value%2 match {
  case 0 => true
  case 1 => false
}

  def testIsEven(value: Int): Boolean = IsEven(value)

  def WinsA(a: Hand, b: Hand): Result = a match {
    case Rock=>b match {
      case Rock => Draw
      case Paper => Lose
      case Scissors => Win
    }
    case Paper => b match {
      case Rock => Win
      case Paper => Draw
      case Scissors => Lose
    }
    case Scissors => b match {
      case Rock => Lose
      case Paper => Win
      case Scissors => Draw
    }
  }

  def testWinsA(a: Hand, b: Hand): Result = WinsA(a,b)

def ExtractMammalWeight(animal: Animal): Int = animal match {
  case animal: Mammal => animal.weight
  case _ => -1
}

  def testExtractMammalWeight(animal: Animal): Int = ExtractMammalWeight(animal)

def UpdateFood(animal: Animal): Animal = animal match {
  case fish: Fish => fish.food = Plants; fish
  case bird: Bird => bird.food = Plants; bird
  case _ => animal
}

  def testUpdateFood(animal: Animal): Animal = UpdateFood(animal)
}
