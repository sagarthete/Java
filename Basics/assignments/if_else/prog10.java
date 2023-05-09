//to check pythagorean triplet

   import java.util.Scanner;

   class Pytha{
   
         public static void main(String [] args){
	 
	      Scanner s = new Scanner(System.in);
	      System.out.println("enter first number");
	      int a = s.nextInt();
	      System.out.println("enter second number");
	      int b = s.nextInt();
	      System.out.println("enter third number");
	      int c = s.nextInt();

	      if(((a*a + b*b) == c*c) || ((a*a + c*c) == b*b) || ((b*b + c*c) == a*a) ){
	       System.out.println("this is pythagorean triplet");
	      }
	      else{
	       System.out.println("this is not pythagorean triplet");
	      
	      }
	 }
   }
