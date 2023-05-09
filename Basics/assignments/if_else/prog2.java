//check the number is greater than 10 or not

  import java.util.Scanner;

  class Show{
       
	public static void main(String [] args){
	
	     int num;
	     Scanner s = new Scanner(System.in);
	     System.out.println("enter number");
	     num = s.nextInt();

	     if(num>10){
	     System.out.println("greater than 10");
	      
	     }
	     else if(num<10){
	     System.out.println("less than 10");
	      
	     }
	     else{
	     System.out.println("equal to 10");
	     
	     }
	}
  
  }
