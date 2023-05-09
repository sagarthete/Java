 
    // wrong initialization

    class ArrayDemo{
    
          public static void main(String args[]){
	  
	       int arr[][] = new int [3][];

	       arr[0] = {1,2,3}; //here we are just assigning the value ,object are not created of 3 1D arrays
	       arr[1] = {4,5};
	       arr[2] = {6};
	  }
    }
