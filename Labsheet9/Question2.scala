object Question2 {
    def classifyNumber(input: Int): String = {
        input match {
            case x if x <= 0 => "Neagtive/Zero is input"
            case x if x%2 == 0 => "Even number is given"
            case _ => "Odd number is given"
        }
    }
    def main(args: Array[String]): Unit = {
        if (args.isEmpty){
            println("Give an integer input.")
        }
        else {
            val input = args(0).toInt
            val result = classifyNumber(input)
            println(result)
        }
    }
}