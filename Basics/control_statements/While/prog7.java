//print all digits of given number

 import java.util.Scanner;

  class Digit{
  
      public static void main(String [] args){
      
             Scanner s = new Scanner(System.in);
	     System.out.println("enter number");
	     int num = s.nextInt();

	     while(num != 0){
	     
	          System.out.println(num % 10);
		  num = num / 10;
	     }
      }
  }
