object TransposeMatrix
{
 
	def main(args: Array[String]): Unit = 
	{
	  var mat = Array.ofDim[Int](3,3);
	  var rmat = Array.ofDim[Int](3,3);
	  
	  //aceept matix
	  println("\n Enter the matrix elements :--> ")
	  for(i<-0 to 2)
	  {
	    for(j<-0 to 2)
	    {
	      mat(i)(j) = scala.io.StdIn.readInt()
	    }
	  }
	  
	  //display matrix
	  for(i<-0 to 2)
	  {
	    for(j<-0 to 2)
	    {
	      print(mat(i)(j)+" ")
	    }
	    println()
	  }
	
	
	//find transpose
	for(i<-0 to 2)
	{
	  for(j<-0 to 2)
	  {
	    rmat(i)(j) = mat(j)(i)
	  }
	}
	
	//display transpose
	print("\n Transpose of matrix is :--> \n")
	for(i<-0 to 2)
	{
	  for(j<-0 to 2)
	  {
	    print(rmat(i)(j)+ " ")
	  }
	  println()
	}
 }
}
