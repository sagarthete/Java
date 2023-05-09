// print the factoers of the number
 
   import java.util.Scanner;
   class Factor{
   
         public static void main(String sagar[]){
	 
	       Scanner s = new Scanner (System.in);
	       System.out.println("enter number");
               int num = s.nextInt();
  
              for(int i=1;i<=num/2;i++){
	      
	         if(num%i==0){
		   System.out.println(i);
		 }
	      }
	           
		   System.out.println(num);
			      
			      	       
	 }
   }
