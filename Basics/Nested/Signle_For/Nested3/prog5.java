/* 10 10 10 10
 * 11 11 11
 * 12 12
 * 13
 */

     class Nested{
     
          public static void main(String sagar[]){
	   
		  int row=4;
		  int count=0;
		  int x=row;
		  int num=10;
	         for(int i = 1;i<=x;i++){
		    System.out.print(num+" ");

		     if(i==x){
		        System.out.println();
			x--;
			num++;
			i=0;
		}
		     if(x==0){
		        break;
		     }
		 }
	  }
     
     }
