//Create abstract class Order (id, description). Derive two classes PurchaseOrder&amp; 
//SalesOrder with members Vendor and Customer. Create object of each PurchaseOrder and 
//SalesOrder. Display the details of each account.
abstract class Order(id:Int,des:String)
{
  def display()
}
class PurchaseOrder(id:Int,des:String,Vendor:String) extends Order(id,des)
{
  def display()
  {
    println("\n Details of Purchase Order")
    println("Order Id is :--> "+id)
    println("Order Description is :--> "+des)
    println("Vendor is :--> "+Vendor)
  }
}
class SalesOrder(id:Int,des:String,Customer:String) extends Order(id,des)
{
  def display()
  {
    println("\n Details of Sales Order")
    println("Order Id is :--> "+id)
    println("Order Description is :--> "+des)
    println("Customer is :--> "+Customer)
  }
}

object HelloWorld 
{
	def main(args: Array[String]): Unit = 
	{
	 var po = new PurchaseOrder(101,"Pen","Ridhi")
	 po.display()
	 
	 var so = new SalesOrder(102,"Pencil","Sidhi")
	 so.display()
	}
}