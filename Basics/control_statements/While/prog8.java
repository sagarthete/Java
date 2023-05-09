  // sum of digit of number

 import java.util.Scanner;
  
      class Sum{
      
          public static void main(String [] sagar){
	  
	       Scanner s =new Scanner(System.in);
	       System.out.println("enter number");
	       int num = s.nextInt();

	       int sum = 0;

	       while(num!=0){
	         
                   int rem = num % 10;
		   sum = sum + rem;
	           num = num/10;
	   
	      }
	     System.out.println(sum);
	  }

      }
  
