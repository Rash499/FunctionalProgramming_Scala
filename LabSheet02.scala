object Labsheet02{

    //Question 3
    def calculatetotalsalary(normalhours: Int, othours: Int): Int = (normalhours*250 + othours*85)*4
    def taxformonth(totalsalary: Int, tax: Double) : Double = totalsalary*(tax/100)
    def calculatetakehomesalary(totalsalary: Int, taxfees: Double): Double = totalsalary- taxfees 

    //Question 4
    def calculateattendance(ticketprice: Int): Int = 120 + (15-ticketprice)*4
    def calculatetotalincome(attendees:Int, ticketprice:Int):Int = attendees*ticketprice
    def calculatetotalcost(attendees: Int) : Int = 500 + attendees*3
    def profit(totalincome : Int, totalcost: Int): Int = totalincome-totalcost

    def main(args: Array[String]):Unit = {

        //Question 1
        
        var i:Int = 2
        var j:Int = 2
        var k:Int = 2
        var m:Int = 5
        var n:Int = 5
        var f:Float = 12.0f
        var g:Float = 4.0f
        var c:Char = 'X'
        
        println(k+12*m)
        println(m/j)
        println(n%j)
        println(m/j*j)
        println(f+10*5+g)
        //println(++i*n)
        
        //Question 2
        /*
        var a:Int = 2
        var b:Int = 3
        var c1:Int = 4
        var d:Int = 5
        var k1:Float = 4.3f

        println(--b*a + c*d--);
        println(a++);
        println(-2*(g-k)+c);
        println(c=c++);
        println(c=++c*a++);
        */
        println(s"Total take home salary: ${calculatetakehomesalary(calculatetotalsalary(40,30),taxformonth(calculatetotalsalary(40,30),12.0))}");
        //calling function with different ticketprices
        println(s"Total Profit for Ticketprice:Rs10 =>${profit(calculatetotalincome(calculateattendance(10),10),calculatetotalcost(calculateattendance(10)))}");
        println(s"Total Profit for Ticketprice:Rs15 =>${profit(calculatetotalincome(calculateattendance(15),15),calculatetotalcost(calculateattendance(15)))}");
        println(s"Total Profit for Ticketprice:Rs20 =>${profit(calculatetotalincome(calculateattendance(20),20),calculatetotalcost(calculateattendance(20)))}");
        println(s"Total Profit for Ticketprice:Rs30 =>${profit(calculatetotalincome(calculateattendance(30),30),calculatetotalcost(calculateattendance(30)))}");
    }
}