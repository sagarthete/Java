// print the factoers  count of the number
 
   import java.util.Scanner;
   class Factor{
   
         public static void main(String sagar[]){
	 
	       Scanner s = new Scanner (System.in);
	       System.out.println("enter number");
               int num = s.nextInt();
      
	       int count = 0;
	      if(num==0){
	        System.out.println("0");
	      }
	      else if(num<0){
              for(int i=-1;i>=num/2;i--){
	      
	         if(num%i==0){
		    count++;
		 }
               } 
		   System.out.println(++count);
	      
	      }

              
	      else{
              for(int i=1;i<=num/2;i++){
	      
	         if(num%i==0){
		    count++;
		 }
	      }
	           
		   System.out.println(++count);
	      }		      
			      	       
	 }
   }
