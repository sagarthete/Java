
  class Demo{
  
        static {
	
	   System.out.println("in  static block 1 of Demo");
	}

        static {
	
	   System.out.println("in  static block 2 of Demo");
	}
    
     }

   class Demo2{
   
         static {
	 
	    System.out.println("int static of Demo2");
	 }

	 public static void main(String args[]){
	 
	        Demo obj = new Demo();
	 }
   }
