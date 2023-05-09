//check number is positive or negative  
  
  import java.util.Scanner;

   class pos_neg{
   
         public static void main(String []args){
	 
              int num;		 
	      Scanner s = new Scanner(System.in);
	      System.out.println("enter number");
	      num = s.nextInt();

	      if(num>0){
	       System.out.println("number is positive");
	      }
              else if(num<0){
	       System.out.println("number is negative");
	      
	      }
	      else{
	       System.out.println("zero");
	      }

	 }
   }
