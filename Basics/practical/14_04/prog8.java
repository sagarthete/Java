/* $
 * @ @
 * & & & 
 * # # # #
 * $ $ $ $ $
 * @ @ @ @ @ @
 * & & & & & & &
 * # # # # # # # #	
 */

       import java.util.Scanner;
       class Pattern{
       
            public static void main(String sagar[]){
	    
	             int n=row;
		   for(int i=1;i<=row;i++){
		         
		       for(int j = 1;j<=i;j++){
		           int num = row-n;
		            if(num==0){
			      System.out.print("$ ");
			    }else if(num%2==0){
			     System.out.print("@ ");
			    }else if(num%3==0){
			     System.out.print("& "); 
			    }else{
			     System.out.print("# ");
			    }


		       }
		       if(n%4==0)
			      n=4;
		       else
			      n--; 
		       System.out.println();
		   }
	    }
       }
