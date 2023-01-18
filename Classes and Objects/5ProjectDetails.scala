//Create class Project (id, name, location). Define parameterized constructor. Keep a count of 
//each object created and display the details of each project.
class Project(id:Int,nm:String,loc:String)
{
  def display()
  {
    println("\n Project details are :--> ")
    println("Project Id is :-->"+id)
    println("Project name is :--> "+nm)
    println("Project Location is :--> "+loc)
  }
}

object HelloWorld
{
	def main(args: Array[String]): Unit = 
	{
	  var n = scala.io.StdIn.readInt();
	  println("\n How many project details you want :--> "+n)
	  var arr = new Array[Project](n)
	  for(i<-0 to n-1)
	  {
	    var id = scala.io.StdIn.readInt()
	    println("Enter the Project Id :--> "+id)
	    
	    var nm = scala.io.StdIn.readLine()
	    println("Enter the project name :--> "+nm)
	    
	    var loc = scala.io.StdIn.readLine()
	    println("Enter the location :--> "+loc)
	    
	    arr(i) = new Project(id,nm,loc)
	  }
	  
	  for(i<-0 to n-1)
	  {
	    arr(i).display()
	  }
	}
}