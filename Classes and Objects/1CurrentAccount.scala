//Define a class CurrentAccount (accNo, name, balance, minBalance). Define appropriate 
//constructors and operations withdraw(), deposit(), viewBalance(). Create an object and 
//perform operations.
class CurrentAccount(var accno:Int,var nm:String,var bal:Float,var minbal:Float)
{
  var accNo : Int = accno;
  var name : String = nm;
  var balance : Float = bal;
  var minbalance : Float = minbal;
  
  def withdraw()
  {
    println("\n Withdraw Operation")
    var amt : Float = scala.io.StdIn.readFloat()
    println("Enter the amount to withdraw :--> "+amt)
    if((balance-amt)>=minbalance)
    {
      println("Withdraw Successfully")
      balance = balance-amt;
      println("Available balance is : "+balance)
    }
    else
    {
      println("Canont withdraw as minbalance is : "+minbalance)
    }
  }
  
  def deposit()
  {
     println("\n Deposit Operation")
     var amt : Float = scala.io.StdIn.readFloat()
     println("\n Enter the amount to deposit :--> "+amt)
     
     println("Balance before deposit is : "+balance)
     balance = balance + amt;
     println("Balance  after deposit  is : "+balance)
  }
  def viewbalance()
  {
    println("\n View Balance Operation")
    println("Account Balance is : "+balance)
  }
  
}

object HelloWorld 
{
	def main(args: Array[String]): Unit = 
	{
	  println("\n Enter the Account details for new customer :--> ")
    var ano = scala.io.StdIn.readInt()
    println("enter the Account number :--> "+ano)
    
    var name = scala.io.StdIn.readLine()
    println("Enter the Account holders name :--> "+name)
    
    var bal = scala.io.StdIn.readFloat()
    println("Enter the Account balance :--> "+bal)
    
    var minbal = scala.io.StdIn.readFloat()
    println("Enter the Account min balance :-->  "+minbal)
    
    var obj = new CurrentAccount(ano,name,bal,minbal)
    var op =4
    do
    {
      println("\n1. Withdraw")
      println("2. Deposit")
      println("3. view Balance")
      println("4. Exit")
     
      op = scala.io.StdIn.readInt()
       println("Enter your choice :--> "+op)
      op match
      {
        case 1 => obj.withdraw()
        case 2 => obj.deposit()
        case 3 => obj.viewbalance()
        case 4 => println("Exit")
                  System.exit(1)
        case default => println("Unexpected Case "+default.toString)
      }
    }while(op!=5)
	}
}