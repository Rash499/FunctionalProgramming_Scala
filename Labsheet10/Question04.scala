// Account class definition
class Account(val id: String, var balance: Double) {
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

// Bank object containing a list of accounts and operations
object Bank {
  var accounts: List[Account] = List()

  // 4.1 List of Accounts with negative balances
  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(_.balance < 0)
  }

  // 4.2 Calculate the sum of all account balances
  def totalBalance: Double = {
    accounts.map(_.balance).sum
  }

  // 4.3 Calculate final balances after applying interest
  def applyInterest(): Unit = {
    accounts.foreach { account =>
      if (account.balance > 0) {
        account.balance += account.balance * 0.05  // Deposit interest
      } else {
        account.balance += account.balance * 0.1   // Overdraft interest
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val acc1 = new Account("A001", 1000)
    val acc2 = new Account("A002", -200)
    val acc3 = new Account("A003", 300)
    val acc4 = new Account("A004", -50)

    accounts = List(acc1, acc2, acc3, acc4)

    println("Accounts with negative balances:")
    accountsWithNegativeBalances.foreach(println)

    println(s"Total balance of all accounts: ${totalBalance}")

    applyInterest()
    println("Final balances after applying interest:")
    accounts.foreach(println)
  }
}

