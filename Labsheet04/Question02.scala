object Question02 {

  def checkNumber(input: Int): Unit = {
    input match {
      case x if x <= 0 => println("Negative/Zero is input")
      case x if x % 2 == 0 => println("Even number is given")
      case _ => println("Odd number is given")
    }
  }

  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      println("Please provide an integer input.")
    } else {
      try {
        val input = args(0).toInt
        checkNumber(input)
      } catch {
        case _: NumberFormatException => println("Please provide a valid integer.")
      }
    }
  }
}
