/*to print the prime numbers from given series
 */

  import java.util.Scanner;

  class IODemo{
  
        public static void main(String sagar[]){
	
	       Scanner s = new Scanner(System.in);
	       System.out.println("enter range");
	       int st = s.nextInt();
	       int end = s.nextInt();
               System.out.println("prime numbers are");
	       for(int i=st;i<=end;i++){
	           int count = 0;
	           for(int j = 1;j<=i/2;j++){
		      if(i%j==0){
		       count++;
		      } 
		      
		   } 
		   if(count<2){
		     System.out.println(i);
		   }    
		   
	       }
	}
  }
