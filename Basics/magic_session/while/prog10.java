   // to revrse the number

   import java.util.Scanner;
    
      class Reverse{
      
	   public static void main(String [] args){
	   
	       Scanner s = new Scanner(System.in);
	       System.out.println("enter any number");
	       int num = s.nextInt();
     
	       int num1 = num;

	       int rev = 0;
	       while(num!=0){
	       
	           int rem = num%10;
		   rev = rev*10+rem;
		   num = num/10;
	       } 

	       System.out.println("reverse of the number is " +rev);
	   
               if (num1==rev){
	          System.out.println("number is palindrome");
	       }
	       else{
	         System.out.println("number is not palindrome");
	       }

	   }  
            


      }
