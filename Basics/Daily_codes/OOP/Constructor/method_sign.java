// in the method_table every method must have the unique signature
// Demo() = Demo();
// int fun(int x) = fun(int);  // signetures
   class Demo{
   
         Demo(){
	 
	    System.out.println("in no-args constructor 1");
	 }

	 Demo(){
	 
	    System.out.println("in no-args constructor 2");   //error
	 
	 }
   
	 public static void main(String args[]){
	 
	    System.out.println("in main method");
	      
	 } 
   }
