/* A 1 B 2
 * A 1 B 2
 * A 1 B 2
 * A 1 B 2
 */

   class Nested{
   
         public static void main(String sagar[]){
	 
                int num = 1;
                char ch = 'A';		
	  for(int i = 1;i<=16;i++){
	     
		  if(i%4==0){
			System.out.print(num);  
		     System.out.println();			     
		     ch = 'A';
		     num=1;
		  }
		  else if(i%2==0){
		    System.out.print(num+" ");
		    num++;
		  }
		  else{
		    System.out.print(ch + " ");
		    ch++;
		  }
                		  
	    }
	  }
   }
