object Question2 {
  
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator must not be zero")

    private val g = gcd(n.abs, d.abs) // Greatest common divisor
    val numerator: Int = n / g
    val denominator: Int = d / g

    def neg: Rational = new Rational(-numerator, denominator)

    def sub(that: Rational): Rational = {
      new Rational(
        this.numerator * that.denominator - that.numerator * this.denominator,
        this.denominator * that.denominator
      )
    }

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    override def toString: String = s"$numerator/$denominator"
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)  
    val y = new Rational(5, 8)  
    val z = new Rational(2, 7)  

    // Performing the subtraction x - y - z
    val result = x.sub(y).sub(z)

    println(s"Result of x - y - z: $result")
  }
}

