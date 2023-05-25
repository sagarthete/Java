
    class StringBF{
    
          public static void main(String args[]){
	  
	         StringBuffer arr[] = new StringBuffer[3];
	  
		 arr[0] = new StringBuffer("sagar");
		 arr[1] = new StringBuffer("thete");
		 
		 System.out.println(arr[0]);
		 System.out.println(arr[1]);

		 System.out.println(System.identityHashCode(arr));
		 System.out.println(System.identityHashCode(arr[0]));
		 System.out.println(System.identityHashCode(arr[1]));
	  }
    
    }
