object LabSheet03{

    //Question no. 01
    def reverse(s :String): String ={
        if (s.isEmpty) "" //check if the string is empty
        else reverse(s.tail) + s.head 
    }

    //Question no. 02
    def checkStrings(strings: List[String]): List[String] = {
        strings match{
            case Nil => Nil //check the list is empty
            case head :: tail => //pattern match to extract head and tail
                if(head.length > 5) head :: checkStrings(tail) //length > 5 include it in the result list and
                                        //recursively call checkStrings(tail)
                else checkStrings(tail) //exclude it from the result list and recursively call the function
        }
    }

    //Question no. 03
    def mean(num1: Int, num2: Int): Double= {
        val avg = (num1 + num2)/2.0
        BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }

    //Question no. 04
    def sumofeven(nums: List[Int]):Int = {
        nums match{
            case Nil => 0
            case head :: tail =>
                if (head % 2 == 0) head + sumofeven(tail)
                else sumofeven(tail)
        }
    }
    def main(args: Array[String]): Unit={
        println("Enter a string: ")
        val input = scala.io.StdIn.readLine()
        println(s"Original: $input")
        println(s"Reversed: ${reverse(input)}")
        println()

        println("Enter strings: ")
        val inputstrings = scala.io.StdIn.readLine().split(" ").toList
        val result = checkStrings(inputstrings)
        println(s"Original List: $inputstrings")
        println(s"Result List: $result")
        println()

        println("Enter the first number:")
        val num1 = scala.io.StdIn.readInt()
        println("Enter the second number:")
        val num2 = scala.io.StdIn.readInt()
        val result1 = mean(num1,num2)
        println(f"Arithmatic mean is $result1%.2f")
        println()

        println("Enter integers: ")
        val integerlist = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList
        val resultsum = sumofeven(integerlist)
        println(s"The sum of the all even numbers: $resultsum")
    }
}
//2200412