// constructor trails
//stack overrflow error
   class Demo{
   
         Demo(){
	 
             System.out.println("in constructor");		 
	     Demo obj = new Demo();
	 }

	 public static void main(String args[]){
	 
	       System.out.println("in main method");
	       Demo obj1 = new Demo();
	 }
   
   }
