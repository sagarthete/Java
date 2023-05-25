
    class ArrayDemo{
    
          public static void main(String args[]){
	  
	          int arr[] = new int[2];

		  arr[0] = 5;
		  arr[1] = 6;


		  System.out.println(System.identityHashCode(arr));
		  System.out.println(System.identityHashCode(arr[0]));
		  System.out.println(System.identityHashCode(arr[1]));

	  
	  }
    
    }
