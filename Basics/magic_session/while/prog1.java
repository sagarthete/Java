// program to print the table of two

   import java.util.Scanner;

   class Table{
   
        public static void main(String []args){
	
	       int num;
	       Scanner s = new Scanner(System.in);
	       System.out.println("enter any number");
	       num = s.nextInt();

	       int i=1;
	       while(i<=10){
	       
	          System.out.println(i*2);
		  i++;
	       }
	}
   }
