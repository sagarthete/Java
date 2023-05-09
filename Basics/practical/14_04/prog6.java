// take two characters from user and print their difference\
   import java.util.Scanner;
   class IODemo{
   
         public static void main(String sagar[]){
	 
	        Scanner s = new Scanner(System.in);
		System.out.println("enter two characters");
		char ch1 = s.next().charAt(0);
		char ch2 = s.next().charAt(0);
        
		if(ch1==ch2){
		   System.out.println("character is:- "+ch1);
		}
		else{
		  int diff = ch2 - ch1;
		  System.out.println("difference is:- "+diff);
		}
	 }
   }
