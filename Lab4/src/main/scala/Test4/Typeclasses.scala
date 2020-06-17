package Test4

object Typeclasses extends App {

  trait Reversable[T] {
    def reverse(x: T): T
  }

  object Reversable {
    implicit object ReversableString extends Reversable[String] {
     def reverse(x: String): String = x.reverse
    }
  }

  def reverse[T](str: T)(implicit rev: Reversable[T]): T = rev.reverse(str)

  def testReversableString(str: String): String = reverse(str)
  println(testReversableString("ABCDEF"))

  trait Smash[T] {
    def smash(a: T, b: T): T
  }

  object Smash {
    implicit object SmashInt extends Smash[Int] {
      def smash(a: Int, b: Int): Int = a+b
    }
    implicit object SmashDouble extends Smash[Double] {
      def smash(a: Double, b: Double): Double = a*b
    }
    implicit object SmashString extends Smash[String] {
      def smash(a: String, b: String): String = a.concat(b)
    }
  }

def smash[T](a: T, b: T)(implicit sma: Smash[T]): T = sma.smash(a,b)

  def testSmashInt(a: Int, b: Int): Int = smash(a,b)

  def testSmashDouble(a: Double, b: Double): Double = smash(a,b)

  println(testSmashDouble(2.5, 10.1))

  def testSmashString(a: String, b: String): String = smash(a,b)
}
