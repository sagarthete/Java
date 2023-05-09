
import java.util.Scanner;
class odd{
 
       public static void main(String[]args){
         
	      int range ;
	      Scanner s = new Scanner(System.in);
	      System.out.println("enter range");
	      range = s.nextInt();
	     
              int i = 1;
	      while(i<=range){
	      
	         System.out.println(i);
		 i=i+2;
	      }
       }
 }
