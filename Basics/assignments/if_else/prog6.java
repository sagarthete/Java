// maximum between three

import java.util.Scanner;

  class maximum{
  
        public static void main(String [] args){
	
	       int num1;
	       int num2;
	       int num3;
	        

               Scanner s = new Scanner(System.in);
               System.out.println("enter any three number");
	       num1 = s.nextInt();
	       num2 = s.nextInt();
	       num3 = s.nextInt();

             
	     if(num2==num1 && num2<num3){
	       System.out.println(num1+ "and " +num2+ " are equal and " +num3+ " is greater");
	     }

	     else if(num3==num1 && num3<num2){
	       System.out.println(num1+ " and " +num3+ " are equal and " +num2+ " is greater");
	     }

	     else if(num3==num2 && num2<num1){
	       System.out.println(num2+ " and " +num3+ " are equal and " +num1+ " is greater");
	     }

	     else if(num3==num2 && num2>num1){
	       System.out.println(num2+ " and " +num3+ " are equal and " +num1+ " is smaller");
	     }

	     else if(num1==num2 && num1>num3){
	       System.out.println(num2+ " and " +num1+ " are equal and " +num3+ " is smaller");
	     }

	     else if(num1==num3 && num1>num2) {
	       System.out.println(num1+ " and " +num3+ " are equal and " +num2+ " is smaller");

	     }

	     else if(num1>num2 && num1>num3){
	       System.out.println(num1+ " is greater");
	     }

	     else if(num2>num1 && num2>num3){
	       System.out.println(num2+ " is greater");
	     }

	     else if(num3>num2 && num3>num1){
	       System.out.println(num3+ " is greater");
	     }

	     else {
	       System.out.println("all are equal ");
	     }
	     

	}
}
