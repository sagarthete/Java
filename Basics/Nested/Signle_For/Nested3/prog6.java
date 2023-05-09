/*9
 *9 8
  9 8 7 
  9 8 7 6
 */

     class Nested{
     
          public static void main(String sagar[]){
	   
		  int row=4;
		  int count=0;
		  int x=1;
		  int num = 9;
	         for(int i = 1;i<=x;i++){
		    System.out.print(num-- +" ");
                        
		     if(i==x){
		        System.out.println();
			x++;
			num=9;
			i=0;
			count++;
		     }
		     if(count==row){
		        break;
		     }
		 }
	  }
     
     }
