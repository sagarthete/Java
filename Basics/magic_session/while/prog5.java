//program to print square of even digit of number
 
  import java.util.Scanner;

  class Digit{
  
       public static void main(String [] sagar){
        
           Scanner s = new Scanner(System.in);
	   System.out.println("enter any number");
	   int num = s.nextInt();
           
	
	   while(num!=0){
	   
	      int rem = num%10;
	      if(rem%2==0){
	         System.out.println(rem*rem+ " is square of "+rem);
	      }
	     num = num/10; 
	   }
         }

  }
