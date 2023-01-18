object Primesum
	{
		def main(args:Array[String])
		{
		  var n1 = scala.io.StdIn.readInt();
	    println("Enter the first number :--> ")
	    var n2 = scala.io.StdIn.readInt();
	    println("\n Enter the second number :--> ")

			var primesum :Int = 0
			
			for(a<-n1 to n2)
			{	
				var sum :Int=0;
				for(i<-2 to a)
				{
					if(a%i == 0)
					{
						sum = sum + i
					}
				}
				
				if(sum == a)
				{
					primesum = primesum + a
				}
			}
			
			println("Sum of Prime Between " +n1+ " to "  +n2+ " is = "+primesum);
		}
	}

