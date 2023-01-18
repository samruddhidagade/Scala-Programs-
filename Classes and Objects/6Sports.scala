//Define a class Sports (id, name, description, amount). Derive two classes Indoor and Outdoor. 
//Define appropriate constructors and operations. Create an object and perform operations.

class Sports
{
  var id:Int=0;
  var nm :String=""
  var des : String=""
  var amt :Float =0
}
class Indoor extends Sports
{
  def accept()
  {
   id = scala.io.StdIn.readInt()
   println("Enter the id :--> "+id)
   nm = scala.io.StdIn.readLine()
   println("Enter the name :--> "+nm)
   des = scala.io.StdIn.readLine()
   println("enter the description :--> "+des)
   amt = scala.io.StdIn.readFloat()
   println("Enter the amount :--> "+amt)
  }
  def display()
  {
    println("\n Indoor Sports details are ")
    println("Indoor Sport Id is : "+id)
    println("Indoor Sport Name is : "+nm)
    println("Indoor Sport Description is : "+des)
    println("Indoor Sport amount is : "+amt)
    
  }
}
class Outdoor extends Sports
{
  def accept()
  {
    id = scala.io.StdIn.readInt()
   println("Enter the id :--> "+id)
   nm = scala.io.StdIn.readLine()
   println("Enter the name :--> "+nm)
   des = scala.io.StdIn.readLine()
   println("enter the description :--> "+des)
   amt = scala.io.StdIn.readFloat()
   println("Enter the amount :--> "+amt)
    
  }
  def display()
  {
    println("\n Outdoor Sports details are ")
    println("Outdoor Sport Id is : "+id)
    println("Outdoor Sport Name is : "+nm)
    println("Outdoor Sport Description is : "+des)
    println("Outdoor Sport amount is : "+amt)
  }
}
object HelloWorld
{
	def main(args: Array[String]): Unit = 
	{
	 var io = new Indoor()
	 io.accept()
	 io.display()
	 
	 var od = new Outdoor()
	 od.accept()
	 od.display()
	}
}