object Q3{
  
  // Function to recursively generate Fibonacci sequence
  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }
  
  // Function to print first n Fibonacci numbers
  def printFibonacci(n: Int): Unit = {
    println(s"First $n Fibonacci numbers:")
    for (i <- 0 until n) {
      print(fibonacci(i) + " ")
    }
    println()
  }
  
  def main(args: Array[String]): Unit = {
    val n = 10 // Change this value to print more or fewer Fibonacci numbers
    printFibonacci(n)
  }
}
