object PerfectNumber {
	def main(args: Array[String]) 
	{
	  var n = scala.io.StdIn.readInt()
	  println("How many numbers you want :--> ")
	  
	  for(a<-1 to n)
	  {
	    var num = scala.io.StdIn.readInt()
	    print("Enter " +a+ "Number -> " )/* Enter the 1 number,2 number..*/
	    
	    var sum : Int =0;
	    var i : Int =1;
	    
	    while(i<=num/2)
	    {
	      if(num%i==0)
	      {
	        sum = sum + i;
	      }
	      i = i+1;
	    }
	    
	    if(sum==num)
	    {
	      println("\n Given number "+num+ " is Perfect Number")
	    }
	    else
	    {
	      println("\n Given number "+num+ " is not a Perfect Number")
	    }
	  }
	}
}