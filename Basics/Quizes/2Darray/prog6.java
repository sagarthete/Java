

    class ArrayDemo{
    
          public static void main(String args[]){
	  
	         int x = 1000;
		 int y = 20000;
		 int s = 21000;
		 int z = x+y;

		 System.out.println(System.identityHashCode(x));
		 System.out.println(System.identityHashCode(y));

		 System.out.println(System.identityHashCode(s));
		 System.out.println(System.identityHashCode(z));
	  }
       
    }
