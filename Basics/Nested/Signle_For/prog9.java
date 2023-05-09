/*  1
 *  2 3 
 *  4 5 6
 */
  
    class Nested{
    
          public static void main(String sagar[]){
	    
		  int row = 3;
		  int x = 1;
		  int num = 1;
		  int count=0;
	         for(int i = 1;i<=x;i++){
		 
		     System.out.print(num+" ");
		     num++;
		 
		    if(i==x){
		       x++;
		       System.out.println();
		       i=0; 
                       count++;
		    } 
		    if(count==row){
		       break;
		    }
		 }
	  }
    }
