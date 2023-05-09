  // by scanner

  import java.util.Scanner;
  import java.lang.*; // this is "lang" package in which the System Class is kept we do not have need to import it ,it is already 
		      //imported by java

   class ScannerDemo{
   
         public static void main(String sagar[]){
	 
	        Scanner s = new Scanner(System.in);
		System.out.println("enter any number");
		int num = s.nextInt();

		System.out.println("number is "+num);
	 
	 }
   
   }
