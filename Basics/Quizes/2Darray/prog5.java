
     class ArrayDemo{
     
           public static void main(String args[]){
	   
	          int x = 10;
		  int y = 200;

		  System.out.println(System.identityHashCode(x));
		  System.out.println(System.identityHashCode(y));

		  System.out.println("\nprinting again\n");
		  System.out.println(System.identityHashCode(x));
		  System.out.println(System.identityHashCode(y));

		   

	   }
      
     }
