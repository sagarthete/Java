// prime number using break
// 1 is considered as prime
import java.util.Scanner;
class Break{
     
         public static void main(String sagar[]){
                
	        Scanner s = new Scanner(System.in);
                System.out.println("enter number");
         	int num = s .nextInt();

		int count = 0;
           for(int i = 2;i<num;i++){
	      
	      if(num%i==0){
	          count++;
		  break;
	      }
	   }		
	      
	    if(count==0){
	       System.out.println("prime"); 
	    }  
	    else{
	       System.out.println("not prime"); 
	    }
	     
       	 }
      }
   
