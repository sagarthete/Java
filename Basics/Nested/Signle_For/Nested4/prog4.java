/* 1 2 3 4
 * 2 3 4
 * 3 4
 * 4
 */
          
       class Nested{
       
             public static void main(String sagar[]){
	     
		     int row = 5;
		     int x=row;
		     int num = 0;
		     int num1 = 0;
	            for(int i=1;i<=x;i++){
		    
		         System.out.print((num1+i)+" ");
			 

			 if(i==x){
			   System.out.println();
			   x--;
			   num++;
			   num1 = num;
			   i=0;
			   
			 }

			 if(x==0)
			    break;
			 
		    }
	     
	     }
       }
