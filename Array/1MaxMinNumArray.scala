object MaxMinNumArray
{
 
	def main(args: Array[String]): Unit = 
	{
	  var n = scala.io.StdIn.readInt()
	  println("\n Enter the size of array :-->"+n)
	  
     var arr = new Array[Int](n)
     for(a<- 0 to (arr.length-1))
     {
       arr(a) = scala.io.StdIn.readInt()
       println("Enter the numbers :--> "+arr(a))
     }
     var max:Int = arr(0)
     var min:Int = arr(0)
     for(i<-0 to(arr.length-1))
     {
       if(arr(i)>max)
       {
         max = arr(i)
       }
       if(arr(i)<min)
       {
         min = arr(i)
       }
     }
     println("\n Maximum number is :--> "+max)
     println("\n Minimum number is :--> "+min)
	}
}