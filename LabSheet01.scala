import scala.math._

object LabSheet01{

    //Question 01 function for calculate the area of a disk
    def AreaOfDisk(r : Int): Double = Pi * r * r

    //Question 02 function for celsius to fahrenheit
    def CelsiusToFahrenheit(c : Double) : Double = c*1.800 +32.00

    //Question 03 function to calculate the total volume of a sphere
    def VolumeOfSphere(r : Int) : Double = (4.0/3.0)*Pi*r*r*r

    //Question 04

    //function to claculate price for coverpage without discount
    def CoverPrice(price: Double, Quantity: Int) : Double = price * Quantity
    //function to calculate the discount
    def Discount(totalCoverprice : Double , discount : Double): Double = totalCoverprice * (1-discount);
    //function to calculate the total coverprice with discount
    def totCoverPrice(coverprice:Double , discount:Double ) : Double = coverprice - discount
    //function to calculate the shipping cost
    def shippingcost(Quantity:Int) : Double =
        //first 50 copy cost is RS.3.00 
        //quantity is less than 50
        if(Quantity <= 50){
            3*Quantity
        }
        else{
            3*50 + (Quantity - 50)*0.75
        }
    //function to calculate the total price adding coverprice and shipping cost
    def totlcost(totalcoverpricewithdiscount:Double,totalshippingcost:Double):Double = totalcoverpricewithdiscount + totalshippingcost

    //Question 5
    //fuction to calculate the easypace time
    def easypacetime(Distance : Double,speed:Double) : Double = Distance * speed
    //function to calculate the tempo pace time
    def tempopacetime(Distance : Double,speed:Double) : Double = Distance * speed
    //function to calculate the totla time
    def totalrunningtime(easypacetime: Double, tempopacetime: Double) : Double = easypacetime*2 + tempopacetime
    //main function
    def main(args: Array[String]): Unit={
        println(s"Area of disk: ${AreaOfDisk(5)}")
        println(s"Farenheight: ${CelsiusToFahrenheit(35)}")
        println(s"Volume of sphere: ${VolumeOfSphere(5)}")
        println(s"Total cost: ${totlcost(totCoverPrice(CoverPrice(24.95,60),Discount(CoverPrice(24.95,60),0.4)),shippingcost(60))}")
        println(s"${totalrunningtime(easypacetime(2,8),tempopacetime(3,7))} Min");
    }

}

//22000412