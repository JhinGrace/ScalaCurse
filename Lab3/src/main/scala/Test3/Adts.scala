package Test3
import scala.util.Try


object Adts extends App{

  def GetNth(list: List[Int], n: Int): Option[Int] = Some(list(n))

  def testGetNth(list: List[Int], n: Int): Option[Int] = GetNth(list, n)

def Double(n: Option[Int]): Option[Int] = if (n.isDefined) Some (n.get*2) else None

  def testDouble(n: Option[Int]): Option[Int] = Double(n)

def IsEven(n: Int): Either[String, Int] = if (n%2==0) Right(n) else Left("Not even")

  def testIsEven(n: Int): Either[String, Int] = IsEven(n)

def SafeDivide(a: Int, b: Int): Either[String, Int] = if (b==0) Left("You can't divide by zero") else Right(a/b)

  def testSafeDivide(a: Int, b: Int): Either[String, Int] = SafeDivide(a,b)

def GoodOldJava(impure: String => Int, str: String): Try[Int] = Try(impure(str))

  def testGoodOldJava(impure: String => Int, str: String): Try[Int] = GoodOldJava(impure, str)
}
