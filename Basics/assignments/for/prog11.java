//COMPOSITE NUMBER

     import java.util.Scanner;
     class Composite{
      
            public static void main(String sagar[]){
	    
	            Scanner s = new Scanner(System.in);
		    System.out.println("enter number ");
		    int num = s.nextInt();

		    int count = 0;
		  
		 for(int i=2; i<=num/2;i++){
		 
		     if(num%i==0){
		        count++;
		        break;	
		     }
		   }
	         
	           if(count==1){
		   
		     System.out.println("composite");
		   }
	           else{
		     System.out.println(" not composite");
		   
		    
		   }	   
	         }
     
               }
   
