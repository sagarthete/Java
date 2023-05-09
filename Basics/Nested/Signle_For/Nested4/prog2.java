/* 1
 * 3 4
 * 6  7  8
 * 10 11 12 13
 */
          
       class Nested{
       
             public static void main(String sagar[]){
	     
		     int row = 5;
		     int count = 0,x=1;
		     int num = 1;
	            for(int i=1;i<=x;i++){
		    
		         System.out.print(num+" ");
			 num++;

			 if(i==x){
			   System.out.println();
			   x++;
			   num++;
			   i=0;
			   count++;
			 }

			 if(count==row)
			    break;
			 
		    }
	     
	     }
       }
