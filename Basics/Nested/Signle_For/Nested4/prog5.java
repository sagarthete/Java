/* A B C D
 * B C D
 * C D
 * D
 */
          
       class Nested{
       
             public static void main(String sagar[]){
	     
		     int row = 5;
		     int x=row;
		     char ch=64;
		     char ch1 = ch;
	            for(int i=1;i<=x;i++){
		    
		         System.out.print((char)(ch1+i)+" ");
			 

			 if(i==x){
			   System.out.println();
			   x--;
			   ch++;
			   ch1 = ch;
			   i=0;
			   
			 }

			 if(x==0)
			    break;
			 
		    }
	     
	     }
       }
