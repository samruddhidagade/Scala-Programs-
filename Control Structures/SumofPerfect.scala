//Sum of all perfect numbers between n1 & n2
object PerfectSum
{
  def main(args:Array[String])
  {
    var n1 = scala.io.StdIn.readInt()
    println("Enter the number :--> "+n1)
    var n2 = scala.io.StdIn.readInt()
    println("Enter the number :--> "+n2)
    var psum:Int=0
    for(num<- n1 to n2)
    {
      var sum:Int=0
      var i : Int =1
      while(i<=num/2)
      {
        if(num%i==0)
        {
          sum = sum+i;
        }
        i = i+1;
      }
      if(sum==num)
      {
        println("\n Perfect Numbers are :--> "+num)
        psum = psum +num;
      }
    }
     println("\n Sum of Perfect numbers are :--> "+psum)
  }
}