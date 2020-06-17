package Test2

import scala.collection.immutable.List

object RecursiveData extends App {

  def ListIntEmpty(list: List[Int]) : Boolean = list match {
    case x :: tail => false
    case Nil         => true
  }

  def testListIntEmpty(list: List[Int]): Boolean = ListIntEmpty(list)

  def ListIntHead(list: List[Int]) : Int = list match {
    case x :: tail => x
    case Nil         => -1
  }

  def testListIntHead(list: List[Int]): Int = ListIntHead(list)

  def ListNotEmpty[A](head: A, list: List[A]) : List[A] = list match {
    case Nil => head :: list
    case x :: tail => list
  }

  class Tree[A](LeftNode: Tree[A], RightNode: Tree[A], leaf: A)
  {
  }

  println(ListNotEmpty(1, List(2)))
}
