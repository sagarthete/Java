// sequence of exwcution
/* 1. static variable
 * 2. static block
 * 3. static method
 * 4. instance variable 
 * 5. instance block
 * 6. constructor
 * 7. instance methods
 */

    class Demo{
    
          static int x = 10;
	         int y = 20;

 
	 Demo(){
	   
	     System.out.println("in constructor");
		  
	 }		 

          static {
	    
	        System.out.println(x);
	        System.out.println("in static block");
	      
	  }
	  
	  
	  {
	        System.out.println(x);
	        System.out.println(y);
		System.out.println("in instance block");
	  
	  }

          static void fun(){
	  
	        System.out.println("in static method fun");
	        
	  }

	  void gun(){
	        
		  System.out.println("in instance method gun");
	        
	  } 

	  public static void main(String args[]){
	  
		 Demo obj = new Demo();
		 fun();
		 obj.gun();

	  }
    
    }
   
   
