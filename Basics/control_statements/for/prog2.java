// print odd numbers till range
 
    import java.util.Scanner;
    class Odd{
    
         public static void main(String sagar[]){
	  
	      Scanner s=new Scanner (System.in);
              System.out.println("enter end of the range");
              int range = s.nextInt();

	      for(int i=1;i<=range;i=i+2){
	         System.out.println(i);
	      }
	 }
}
