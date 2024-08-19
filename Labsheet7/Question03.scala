object Question03{

    def isPrime(num: Int): Boolean = {
        if (num <= 1) false
        else !(2 until num).exists(n => num % n == 0)
    }
    def filterPrime(num1: List[Int]): List[Int] = {
        num1.filter(num => isPrime(num))
    }
    def main(args: Array[String])={
        val input = List(1,2,3,4,5,6,7,8,9,10)
        val prime = filterPrime(input)
        println(prime)
    }
}