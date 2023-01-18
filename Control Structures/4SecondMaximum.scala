object SecondMaximum
{
 
	def main(args: Array[String]): Unit = 
	{
     var arr = new Array[Int](4);
     for(i<-0 to (arr.length-1))
     {
       arr(i) = scala.io.StdIn.readInt()
       println("Enter the number :--> "+arr(i))
     }
     var temp:Int=0;
     for(x<-0 to (arr.length-1))
     {
       for(y<-x+1 to(arr.length-1))
       {
         if(arr(x)<arr(y))
         {
           temp = arr(y)
           arr(y) = arr(x)
           arr(x) = temp
         }
       }
     }
     println("\n Second Maximum Number is :--> "+arr(1))
	}
}