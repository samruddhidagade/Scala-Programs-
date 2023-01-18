object MatrixMultiplication
{
	def main(args: Array[String]): Unit =
	{
	   var row1 = scala.io.StdIn.readInt()
	   println("Enter the row for 1 matrix :--> "+row1)
	   
	   var col1 = scala.io.StdIn.readInt()
	   println("Enter the column for 1 matrix :--> "+col1)
	   
	   var row2 = scala.io.StdIn.readInt()
	   println("Enter the row for 2 matrix :--> "+row2)
     
     var col2 = scala.io.StdIn.readInt()
	   println("Enter the column for 2 matrix :--> "+col2)
	   
	   if(col1==row2)
	   {
	     println("\n Matrix Multiplication is Valid")
	     var mat1 = Array.ofDim[Int](row1,col1)
	     var mat2 = Array.ofDim[Int](row2,col2)
	     var mat3 = Array.ofDim[Int](row1,col2)
	     
	     //accept 1 Matrix
	     for(i<-0 until row1)
	     {
	       for(j<-0 until col1)
	       {
	         mat1(i)(j) = scala.io.StdIn.readInt()
	         println("Enter the matrix element for 1 matrix :--> "+mat1(i)(j))
	       }
	     }
	     
	     //display 1 Matrix
	     println("\n Matrix 1 is :--> ")
	     for(i<-0 until row1)
	     {
	       for(j<-0 until col1)
	       {
	         print(mat1(i)(j)+" ")
	       }
	       println()
	     }
	     
	     //accept 2 Matrix
	     for(i<-0 until row2)
	     {
	       for(j<-0 until col2)
	       {
	         mat2(i)(j) = scala.io.StdIn.readInt()
	         println("Enter the matrix element for 2 matrix :--> "+mat2(i)(j))
	       }
	     }
	     
	     //display 2 Matrix
	     println("\n Matrix 2 is :--> ")
	     for(i<-0 until row2)
	     {
	       for(j<-0 until col2)
	       {
	         print(mat2(i)(j)+" ")
	       }
	       println()
	     }
	     
	     //assign matrix 3 to 0
	     for(i<-0 until row1)
	     {
	       for(j<-0 until col1)
	       {
	         mat3(i)(j) =0
	       }
	     }
	     
	     //calculate Multiplication
	      for(i<-0 until row1)
	     {
	       for(j<-0 until col1)
	       {
	         for(k<-0 until row2)
	         {
	          mat3(i)(j) += mat1(k)(j) * mat2(i)(k)
	         }
	       }
	     }
	     
	     //display 3 Matrix
	     println("\n Matrix 3 is :--> ")
	     println("\n Matrix Multiplication is :--> ")
	     for(i<-0 until row1)
	     {
	       for(j<-0 until col1)
	       {
	         print(mat3(i)(j)+" ")
	       }
	       println()
	     }
	     
	   }
	   else
	   {
	     println("\n Matrix Multiplication is Invalid")
	   }
	}
	
}