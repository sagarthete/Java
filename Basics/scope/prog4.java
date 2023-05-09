class Scope{

      public static void main(String sagar[]){
      
             int x = 10;

	     {
	       int y = 10;
	       System.out.println(y);
	     }
             {
	       int y = 20;
	       System.out.println(y);
	      
	     }
	       System.out.println(x);

      }
 
}
