//program to count odd digit in number
 
  import java.util.Scanner;

  class Digit{
  
       public static void main(String [] sagar){
        
           Scanner s = new Scanner(System.in);
	   System.out.println("enter any number");
	   int num = s.nextInt();
           
	   int count=0;
	    
	   while(num!=0){
	   
	      int rem = num%10;
	      if(rem%2!=0){
	         count++;
	      }
	     num = num/10; 
	   }
         System.out.println("number of odd digit in given number is "+count);
       }

  }
