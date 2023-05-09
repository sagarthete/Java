//program to count the digits of given number

    import java.util.Scanner;

    class Dgits{
    
          public static void main(String []sagar){
	    
		 Scanner s =new Scanner(System.in);
		 System.out.println("enter any number");
		 int num = s.nextInt();
                 int count = 0;
		  
		 while(num!=0){
		    
	             num = num/10;
		     count++;
		     
		 }
	         System.out.println("number of digit in given number are " +count);
	  } 
    }
