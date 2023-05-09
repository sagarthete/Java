//to print the amstrong number

   import java.util.Scanner;

   class Perfect{
   
         public static void main(String sagar[]){
	 
	        Scanner s = new Scanner (System.in);
		System.out.println("enter any number");
		int num = s.nextInt();


		int sum = 0;
                for(int i = 1;i<num;i++){
		
		    if(num%i==0){
		    sum = sum + i;
	            }
                }
		if(num==sum){
		
		  System.out.println(" perfect number");
		} 
		else{
		
		  System.out.println(" not perfect number");
		
		}
	 
	 }
   

   }
