object Question03 {
  // Account class definition
  class Account(id: String, initialBalance: Double) {
    var balance: Double = initialBalance

    def deposit(amount: Double): Unit = {
      if (amount > 0) balance += amount
    }
    def withdraw(amount: Double): Unit = {
      if (amount > 0 && balance >= amount) balance -= amount
    }

    def transfer(amount: Double, toAccount: Account): Unit = {
      if (amount > 0 && balance >= amount) {
        this.withdraw(amount)
        toAccount.deposit(amount)
      }
    }

    override def toString: String = s"Account($id, balance: $balance)"
}

  def main(args: Array[String]): Unit = {
    val acc1 = new Account("A001", 1000)
    val acc2 = new Account("A002", 500)

    println(s"Before Transfer: $acc1, $acc2")

    acc1.transfer(200, acc2)

    println(s"After Transfer: $acc1, $acc2")
  }
}

