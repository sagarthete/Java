
     class ArrayDemo{
     
     
          public static void main(String args[]){
	  
	         int arr[] = {150,200,250};

		   System.out.println(System.identityHashCode(arr[0]));
		   System.out.println(System.identityHashCode(arr[1]));
		   System.out.println(System.identityHashCode(arr[2]));
		   
		   System.out.println("doble printin\n");
		   System.out.println(System.identityHashCode(arr[0]));
		   System.out.println(System.identityHashCode(arr[1]));
		   System.out.println(System.identityHashCode(arr[2]));

	   
	  }
     
     }
