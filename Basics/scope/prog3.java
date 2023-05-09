 class Scope{
 
       public static void main(String sagar[]){
       
              int x = 10;

	      {
	        int y = 20;
	        System.out.println(y);
	      }
	      {
	        y = 30;   //error. cannot find symbol
	      
	      }
         System.out.println(x);
         System.out.println(y);

       }
 
}
