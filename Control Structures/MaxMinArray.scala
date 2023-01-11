object MaxMinArray
	{
		def main(args:Array[String])
		{
		
			var n = scala.io.StdIn.readInt()
				print("\n How Many Elements do u want in Array = "+n)

			var arr = new Array[Int](n)

			for(b<-0 to (arr.length-1))
			{
				
				arr(b) = scala.io.StdIn.readInt()
				print("\n Enter Number = "+arr(b))
			}

			var max:Int = arr(0)
			var min:Int = arr(0)

			for(i<-0 to (arr.length-1))
			{
				if(arr(i) > max)
				{
					max = arr(i)
				}

				if(arr(i) < min)
				{
					min = arr(i)
				}
			}

			println("\n Maximun number is = "+max)
			println("\n Minimum number is = "+min)
		}
	}
	