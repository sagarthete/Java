/* 3C 3C 3C 3C 
 * 3C 3C 3C
 * 3C 3C
 * 3C
 */

     class Nested{
     
          public static void main(String sagar[]){
	   
		  int row=4;
		  int count=0;
		  int x=row;
	         for(int i = 1;i<=x;i++){
		    System.out.print("3C ");

		     if(i==x){
		        System.out.println();
			x--;
			i=0;
		}
		     if(x==0){
		        break;
		     }
		 }
	  }
     
     }
