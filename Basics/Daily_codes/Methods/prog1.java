// static nonstatic 
    
    class StaticDemo{
    
          int x = 10;
   static int y = 20;
          void fun(){
	     System.out.println("in fun");

	  }	
	 static void gun(){
	  
	     System.out.println("in gun"); 
	 } 
	  public static void main(String sagar[]){
	  
	         System.out.println(x);  // error :- nonstatic variable cannot be directly acessed feom static method or scope
		 System.out.println(y);
		 fun();                  // error :- nonstatic method
		 gun();
	  }
	  
	    
    
    }
