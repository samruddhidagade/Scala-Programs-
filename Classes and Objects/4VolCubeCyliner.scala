//Create abstract class Shape with abstract functions volume() and display(). Extend two classes 
//Cube and Cylinder from it. Calculate volume of each and display it
abstract class Shape()
{
  def volume()
  def display()
}
class Cube(a:Int) extends Shape
{
  var vol1:Double=0.0
  def volume()
  {
    vol1 = a*a*a;
  }
  def display()
  {
     println("\n Volume of cube is :--> "+vol1)
  }
}
class Cylinder(r:Int,h:Int)  extends Shape
{
  var vol2: Double=0.0
  def volume()
  {
    vol2 = 3.14*r*r*h
  }
  def display()
  {
    println("Volume of Cylinder is :--> "+vol2)
  }
}

object HelloWorld
{
	def main(args: Array[String]): Unit = 
	{
	  var c1 = new Cube(4)
	  c1.volume();
	  c1.display();
	  
	  var c2 = new Cylinder(10,15)
	  c2.volume();
	  c2.display();
	}
}