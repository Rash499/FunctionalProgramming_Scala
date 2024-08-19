object Question1{
    def calculateInterest(deposit: Double): Double = {
        val rate: Double = deposit match {
            case x if x <= 20000 => 0.02
            case x if x <= 200000 => 0.04
            case x if x <= 2000000 => 0.035
            case _ => 0.065
        }
        deposit * rate
    }

    def main(args: Array[String]): Unit = {
        val dep = 5000000.0
        val interest = calculateInterest(dep)
        println(s"Interest for Rs. $dep deposit: Rs. $interest")
    }
}