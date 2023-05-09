//to print the amstrong number

   import java.util.Scanner;
   class Amstrong{
   
         public static void main(String sagar[]){
	 
	        Scanner s = new Scanner (System.in);
		System.out.println("enter any number");
		int num = s.nextInt();


		int sum = 0;
                for(int i = num;i>0;i=i/10){
		
		    int rem = i % 10;	
		    int mult = 1;

		    for(int j = num;j>0;j=j/10){
		    
		        mult = mult*rem;
		    }

		    sum = sum + mult;
		}
   
		if(num==sum){
		
		  System.out.println(" Armstrong number");
		} 
		else{
		
		  System.out.println(" not Armstrong number");
		
		}
	 
	 }
   
   }
