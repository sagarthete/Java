// static block comes before main method on stackframe to initialize static variables
    class Demo{
    
         static int num = 10;

	 static{
	 
	    System.out.println("in static block");
	 
	 } 

	 public static void main(String args[]){
	 
	      System.out.println("in main method");
	 
	 }
   

    }
