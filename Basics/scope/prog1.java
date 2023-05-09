 // to check the scope of the vaariable
 
  class Scope{
  
        public static void main(String sagar[]){
	
	       int x = 10;

	       {
	          int x = 20;             
	           System.out.println(x);  //error ,already define in main method
	       }
               {
	          x = 30;
	          System.out.println(x);
	       }
     
               System.out.println(x);	
	}
  
  }
