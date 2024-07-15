import scala.io.StdIn.readLine

object Q1{
  
  // Function to get product list from user input
  def getProductList: List[String] = {
    var products = List.empty[String]
    var input = ""
    
    while (input != "done") {
      println("Enter product name (type 'done' to finish): ")
      input = readLine().trim()
      if (input != "done") {
        products = products :+ input
      }
    }
    
    products
  }
  
  // Function to print product list with positions
  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }
  
  // Function to get total number of products
  def getTotalProducts(products: List[String]): Int = {
    products.length
  }
  
  def main(args: Array[String]): Unit = {
    val productList = getProductList
    println("\nList of Products:")
    printProductList(productList)
    println(s"\nTotal number of products: ${getTotalProducts(productList)}")
  }
}
