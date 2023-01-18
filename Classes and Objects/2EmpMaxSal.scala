//Define a class Employee (id, name, salary). Define methods accept() and display().Display 
//details of employee having maximum salary.
class Employee
{
  var id:Int =0;
  var nm : String =" ";
  var sal : Float = 0;
  def this(id:Int,nm:String,sal:Float)
  {
    this()
    this.id = id;
    this.nm = nm;
    this.sal = sal;
  }
  def accept()
  {
    println("\n Accept Operation ")
    id = scala.io.StdIn.readInt()
    println("Enter the employee id :-->  "+id)
    nm = scala.io.StdIn.readLine()
    println("Enter the Employee name :--> "+nm)
    sal = scala.io.StdIn.readFloat()
    println("enter the Employee Salary :-> "+sal)
    
  }
  def display()
  {
    println("\n Display Operation")
    println("Employee Id is :--> "+id)
    println("Employee name is :--> "+nm)
    println("Employee Salary is :--> "+sal)
  }
}
object HelloWorld 
{
	def main(args: Array[String]): Unit = 
	{
	  var n = scala.io.StdIn.readInt()
	  println("How many employees you want :--> "+n)
	  
	  var arr = new Array[Employee](n)
	  for(i<- 0 to n-1)
	  {
	    arr(i) = new Employee()
	    arr(i).accept()
	  }
	  for(i<-0 to n-1)
	  {
	    arr(i).display()
	  }
	  var max = arr(0)
	  for(i<-0 to n-1)
	  {
	    if(arr(i).sal>max.sal)
	    {
	      max = arr(i)
	    }
	  }
	  println("\n Employee with maximum salary is :--> ")
	  max.display()
	}
}