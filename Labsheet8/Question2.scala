object Question2 {

  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      println("Please provide an integer input.")
    } else {
      val input = args(0).toInt

      // Lambda functions
      val isMultipleOfThree = (n: Int) => n % 3 == 0
      val isMultipleOfFive = (n: Int) => n % 5 == 0

      input match {
        case n if isMultipleOfThree(n) && isMultipleOfFive(n) =>
          println("Multiple of Both Three and Five")
        case n if isMultipleOfThree(n) =>
          println("Multiple of Three")
        case n if isMultipleOfFive(n) =>
          println("Multiple of Five")
        case _ =>
          println("Not a Multiple of Three or Five")
      }
    }
  }
}
