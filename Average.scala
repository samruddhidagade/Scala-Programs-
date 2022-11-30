//Q1) Write a program to calculate average of all numbers between n1 and n2.
object Average {
	def main(args: Array[String]): Unit = {
	  var n1 = scala.io.StdIn.readInt();
	  println("Enter the number :--> ")
	  var n2 = scala.io.StdIn.readInt();
	  println("\n Enter the second number :--> ")
	  
	  var sum = (n1+n2)/2;
	  println("\n Avrage of two numbers is :--> "+sum)
	}
}
