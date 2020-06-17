package Test3

object Sequence extends App{

  def LastElement[A](seq: Seq[A]): Option[A] =  Some(seq.last)

  def testLastElement[A](seq: Seq[A]): Option[A] = LastElement(seq)

  val list = List(1,2,3)
  val list2 = List(4,5,6)
  val list3 = List(4,5,4)

  def Zip[A](a: Seq[A], b: Seq[A]): Seq[(A, A)] = a.zip(b)

  def testZip[A](a: Seq[A], b: Seq[A]): Seq[(A, A)] = Zip(a, b)

  def ForAll[A](seq: Seq[A])(cond: A => Boolean): Boolean = seq.forall(cond)

  def testForAll[A](seq: Seq[A])(cond: A => Boolean): Boolean = ForAll(seq)(cond)

  def Palindrome[A](seq: Seq[A]): Boolean = seq.reverse == seq

  def testPalindrome[A](seq: Seq[A]): Boolean = Palindrome(seq)

  def FlatMap[A, B](seq: Seq[A])(f: A => Seq[B]): Seq[B] = seq.foldLeft(Seq[B]())(_ ++ f(_))

  def testFlatMap[A, B](seq: Seq[A])(f: A => Seq[B]): Seq[B] = FlatMap(seq)(f)

}
