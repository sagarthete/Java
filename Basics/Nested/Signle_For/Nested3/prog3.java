/* 10
 * 9 8
 * 7 6 5
 * 4 3 2 1
 */

     class Nested{
     
          public static void main(String sagar[]){
	   
		  int row=4;
		  int count=0;
		  int x=1;
		  int num = row*(row+1)/2;
	         for(int i = 1;i<=x;i++){
		    System.out.print(num-- +" ");
                        
		     if(i==x){
		        System.out.println();
			x++;
			i=0;
			count++;
		     }
		     if(count==row){
		        break;
		     }
		 }
	  }
     
     }
