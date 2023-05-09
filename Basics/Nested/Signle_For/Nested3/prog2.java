/* 1 
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */

     class Nested{
     
          public static void main(String sagar[]){
	   
		  int row=4;
		  int count=0;
		  int x=1;
		  int num=1;
	         for(int i = 1;i<=x;i++){
		    System.out.print(num++ +" ");
                        
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
