
object rationals{

  val x = new Rational(1,2)
  val y = new Rational(198,10)
  y.add(x).toString()
  val rts = new Rational(10020,100)




class Rational (x: Int, y: Int ) {
    require(y!=0,"Denominator must be positive")

    private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b,a%b)
    private val g = gcd(x,y)
    private def num = x
    private def den = y


    def this(x: Int)= this(x,1)

    def add(that: Rational): Rational =
      new Rational(num * that.den + den * that.num,
                  den*that.den)

    def neg = new Rational (-num, den)

    def sub(that:Rational) = add(that.neg)

    override def toString: String = num/g + "/" + den/g
}
}