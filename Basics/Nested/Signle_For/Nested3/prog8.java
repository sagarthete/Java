 /* J
  * I H
  * G F E
  * D C B A
 */

     class Nested{
     
          public static void main(String sagar[]){
	   
		  int row=4;
		  int count=0;
		  int x=1;
		  char ch = (char)(64+(row*(row+1)/2));
	         for(int i = 1;i<=x;i++){
		    System.out.print(ch-- +" ");
                        
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
