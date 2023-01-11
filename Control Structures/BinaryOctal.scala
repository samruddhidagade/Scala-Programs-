object BinaryOctal
	{

		def octal(num:Int) :Unit = 
		{
			 printf("\n Octal value   : %o\n", num) 
		}


		def main(args:Array[String])
		{
			print("\n Enter the Number = ")
			var num = scala.io.StdIn.readInt()
			
			var binary = (num).toBinaryString
			
			println("\n Binary of "+num+" is "+binary)
			
			octal(num);
		}
	}
