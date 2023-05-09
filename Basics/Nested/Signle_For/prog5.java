/* A 1 B 2
 * A 1 B 2
 * A 1 B 2
 * A 1 B 2
 */

   class Nested{
   
         public static void main(String sagar[]){
	 
		int count = 1;
                int num = 1;
                char ch = 'A';	
	        int col = 5;	
	  for(int i = 1;i<=20;i++){
	  
	    if(col%2==0){
               if(i%2==1){
	       System.out.print(ch+" ");
	       ch++;
	      
	     }
	     if(i%2==0){
	       System.out.print(num+" ");
	       num++;
	     }
	    if(i%4==0){
	       System.out.println();
	       num = 1;
	       ch = 'A';
	    }
	  }
	  else{
		  count++;
	       if(count%2==0){	  
             	  if(i%2==1){
	      		 System.out.print(ch+" ");
	      	       	ch++;
	      
	     }
	       	  if(i%2==0){
	       		System.out.print(num+" ");
	      	        num++;
	     }
	    	  if(i%5==0){
	      		ch = 'A';
	      		num = 1; 
	      		System.out.println();
	       
	       
	          }
	       } 
	      else{

	      
             	  if(i%2==1){
	      		 System.out.print(num+" ");
	      	       	num++;
	      
	     }
	       	  if(i%2==0){
	       		System.out.print(ch+" ");
	      	        ch++;
	     }
	    	  if(i%5==0){
	      		ch = 'A';
	      		num = 1; 
	      		System.out.println();
	       
	       
	          }
	      }
	         
	      
	      } 	  
	    }
	  }
	  
   } 
   
