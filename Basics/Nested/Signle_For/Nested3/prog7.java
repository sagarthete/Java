/* F
 * E F
 * D E F
 * C D E F
 * B C D E F
 * A B C D E F
 */

     class Nested{
     
          public static void main(String sagar[]){
	   
		  int row=6;
		  int count=0;
		  int x=1;
		  char ch = (char)(64+row);
		  char ch1 = ch;
	         for(int i = 1;i<=x;i++){
		       
		    System.out.print(ch1++ +" ");
                        
		     if(i==x){
		        System.out.println();
			x++;
			ch--;
			ch1=ch;
			i=0;
			count++;
		     }
		     if(count==row){
		        break;
		     }
		 }
	  }
     
     }
