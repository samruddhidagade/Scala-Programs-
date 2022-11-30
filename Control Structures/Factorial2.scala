//Q2) Write a program to calculate a factorial of a number
object Factorial2{
	def main(args: Array[String]): Unit = {
	  var n = scala.io.StdIn.readInt();
	  println("Enter the number :--> ");
	  var f:Int=1;
	  while(n>1)
	  {
	    f = f*n;
	    n=n-1;
	  }
	 
	  println("\n Factorial is :--> "+f);
	}
}
