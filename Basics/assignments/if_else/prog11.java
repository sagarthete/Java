//real time

  import java.util.Scanner;

  class Petrol{
  
        public static void main(String [] sagar){
	   
	    
	       Scanner s = new Scanner(System.in);
	       System.out.println("enter quantity");
	       int q = s.nextInt();

	       if(q > 10){
	         System.out.println("capacity of fuel tank is 10");
	       }
	       else if(q<3){
	         System.out.println("low fuel");
	       }
	       else if(q==3){
	         System.out.println("on reserve");
	       }
	       else {
	          System.out.println("Sufficient fuel");
	       }
	}
  }
