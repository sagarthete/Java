//program to print even numbers in reverse order and odd numbers also in reverse order but by difference of two


    import java.util.Scanner;

    class Reverse{
    
          public static void main(String [] args){
	  
	        Scanner s = new Scanner(System.in);
                System.out.println("enter number");
		int num = s.nextInt();

		if(num%2==0){
		   while(num!=0){
		   
		      System.out.println(num--);
		   }
		}
	        else {
		
		   while(num>=0){
		     
		      System.out.println(num);
		      num=num-2;
		   }
		
		} 
		
	  }
    }
