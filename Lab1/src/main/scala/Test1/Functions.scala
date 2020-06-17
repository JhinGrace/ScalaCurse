package Test1


object Functions extends App {

  def AreaCircle(r: Double): Double = r*r*Math.PI

  def testCircle(r: Double): Double = AreaCircle(r)

  def AreaRectangleCurried(a: Double)=(b: Double) => a*b

  def testRectangleCurried(a: Double, b: Double): Double = AreaRectangleCurried(a)(b)

  def AreaRectangleUc(a: Double, b: Double): Double = a*b

  def testRectangleUc(a: Double, b: Double): Double = AreaRectangleUc(a,b)
}
