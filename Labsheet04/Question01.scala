object Question_01 {
  var itemNames: Array[String] = Array("apple", "banana", "orange")
  var itemQuantities: Array[Int] = Array(10, 5, 8)

  def displayInventory(): Unit = {
    println("Current Inventory:")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}: ${itemQuantities(i)}")
    }
  }

  def restockItem(item: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(item)
    if (index != -1) {
      itemQuantities(index) += quantity
      println(s"Restocked $quantity of $item. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $item does not exist in the inventory.")
    }
  }

  def sellItem(item: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(item)
    if (index != -1) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity of $item. Remaining quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough $item in inventory to sell. Available quantity: ${itemQuantities(index)}")
      }
    } else {
      println(s"Item $item does not exist in the inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("apple", 5)
    sellItem("banana", 2)
    sellItem("orange", 10)
    restockItem("grape", 7)
    displayInventory()
  }
}
