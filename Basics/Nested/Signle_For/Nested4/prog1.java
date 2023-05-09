/* C2W10
 * C2W9 C2W8
 * C2W7 C2W6 C2W5
 * C2W4 C2W3 C2W2 C2W1
 */
          
       class Nested{
       
             public static void main(String sagar[]){
	     
		     int row = 4;
		     int count = 0,x=1;
		     int num = row*(row+1)/2;
	            for(int i=1;i<=x;i++){
		    
		         System.out.print("C2W"+num+" ");
			 num--;

			 if(i==x){
			   System.out.println();
			   x++;
			   i=0;
			   count++;
			 }

			 if(count==row)
			    break;
			 
		    }
	     
	     }
       }
