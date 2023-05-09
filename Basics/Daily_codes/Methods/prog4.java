 
   class StaticDemo{
   
         static int x = 10;
	        int y = 20;

         static void fun(){
	 
	    System.out.println("in fun a = "+x);
	 }
	  
         static void gun(){
	  
	      System.out.println("in gun b ="+y); // error:- nonstatic variable cannot be referenced from static context
	 }
	 public static void main(String sagar[]){
	 
	    System.out.println("in main");
	    fun();
	    gun();
	 }
   
   }
