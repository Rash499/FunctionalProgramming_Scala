object Question02{

    def calcSquare(num: List[Int]):List[Int] = {
        num.map(num => num*num)
    }
    def main(args: Array[String])={
        val input = List(1,2,3,4)
        println(calcSquare(input))
    }
}