object PrimeSum
{
  def main(args:Array[String])
  {
    var n1 = scala.io.StdIn.readInt()
    println("\n Enter the number :--> "+n1)
    var n2 = scala.io.StdIn.readInt()
    println("\n Enter the number :--> "+n2)
    
    var psum : Int =0;
    for(num <- n1 to n2)
    {
      var sum : Int =0;
      for(i<- 2 to num)
      {
        if(num%i==0)
        {
          sum = sum+i;
        }
      }
      if(sum==num)
      {
        psum = psum + num;
        println("\n Perfect numbers are : --> "+num)
      }
    }
    println("\n Sum of prime  numbers is :-->  "+psum)
    
  }
}
