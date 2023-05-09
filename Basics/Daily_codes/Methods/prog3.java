 
   class StaticDemo{
   
         static int x = 10;
	 static int y = 20;

         static void fun(){
	 
	    System.out.println("in fun a = "+x);
	 }
	  
         static void gun(){
	  
	      System.out.println("in gun b ="+y);
	 }
	 public static void main(String sagar[]){
	 
	    System.out.println("in main");
	    fun();
	    gun();
	 }
   
   }
