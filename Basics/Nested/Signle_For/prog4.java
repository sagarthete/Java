/* A 1 A 1
 * A 1 A 1
 * A 1 A 1 
 * A 1 A 1
 */
 
    class Nested{
    
          public static void main(String sagar[]){
	  
	         int num = 1;
	         char ch = 'A';	 

	    for(int i = 1;i<=16;i++){
	    
	       if(i%4==0){
	       
	         System.out.print(num+" ");
		 System.out.println();
	       }
	       else{
	       
	           if(i%2==1){
		   
		    System.out.print(ch+" ");
		   }
		   else{
		    System.out.print(num + " ");
		   }
	       
	       
	       }

	    }
	  } 
    }
