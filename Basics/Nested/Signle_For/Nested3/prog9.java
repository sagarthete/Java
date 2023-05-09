/* 1
 * 8  27
 * 64 125 216
 */

     class Nested{
     
          public static void main(String sagar[]){
	   
		  int row=3;
		  int count=0;
		  int x=1;
		  int num=1;
	         for(int i = 1;i<=x;i++){
		    System.out.print((num*num*num) +" ");
                         num++;
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
