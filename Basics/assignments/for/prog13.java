//Strong number

  import java.util.Scanner;

  class Strong{
    
        public static void main(String sagar []){
	
	       Scanner s = new Scanner(System.in);
	       System.out.println("enter number");
	       int num = s.nextInt();

	        int sum = 0;

	     for(int i = num; i>0 ; i=i/10){
	     
	         int rem = i%10;
		 int fact = 1;

		 for(int j=rem; j>1 ;j--){
		 
		     fact = fact*j;
		 }
	         sum = sum + fact;
	     }
	    
	     if(sum==num){
	      System.out.println("Strong Number");
	     } 
	     else{
	      System.out.println("Not Strong Number");
	     }
	}
   
  }
