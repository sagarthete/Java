
  class Demo{
  
	  int num = 10;
	 
	  void fun(){
	       System.out.println(num);
	  } 
          
	  static {
	
	   System.out.println("in  static block 1 of Demo");
	  } 

          static {
	
	   System.out.println("in  static block 2 of Demo");
	  } 
    
   }

   class Demo2{
   
         static {
	 
	    System.out.println("in static of Demo2");
	    
	    Demo obj1 = new Demo();
	    Demo obj2 = new Demo();

	    obj1.fun();
	    obj2.fun();

	    obj1.num = 20;
	    
	    obj1.fun();
	    obj2.fun();
	 }

	public static void main(String args[]){
	 
        }
   }
