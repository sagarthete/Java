//to print the prime number

   import java.util.Scanner;
   class Prime{
   
         public static void main(String sagar[]){
	 
	        Scanner s = new Scanner (System.in);
		System.out.println("enter any number");
		int num = s.nextInt();

		int count = 0;

		for(int i = 1;i<=num;i++){
		
		    if(num%i==0){
		       count++;
		    }
		}
   
		if(count==2){
		
		  System.out.println(" prime number");
		} 
		else{
		
		  System.out.println(" not prime number");
		
		}
	 
	 }
   
   }
