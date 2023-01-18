object MatrixDeterminant
{
	def main(args: Array[String]): Unit = 
	{
	  var row = scala.io.StdIn.readInt()
	 println("enter the rows of matrix:--> "+row)
	 var col = scala.io.StdIn.readInt()
	 println("Enter the columns of matrix :--> "+col)
	 var arr = Array.ofDim[Int](row,col)
	 
	//accept matrix
	 for(i<-0 until row)
	 {
	   for(j<-0 until col)
	   {
	     arr(i)(j) = scala.io.StdIn.readInt()
	      print("\n Enter the matrix elements :--> "+arr(i)(j))
	   }
	 }
	  
	  //display matrix
	  print("\n The matrix is :-->\n")
	  for(i<-0 until row)
	  {
	    for(j<-0 until col)
	    {
	      print(arr(i)(j)+" ")
	    }
	    println()
	  }
	  
	  if(row==2 && col==2)
	  {
	    var det = (arr(0)(0)*arr(1)(1))-(arr(0)(1)*arr(1)(0))
	    print("\n determinant is :-->"+det)
	  }
	  else
	  {
	    println("rows and columns entered are not valid")
	  }
	}
}