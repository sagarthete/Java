/* 26 Z 25 Y
 * 24 X 23 W
 * 22 V 21 U
 * 20 T 25 Y 
 */

      class Nested{
      
	   public static void main(String sagar[]){
              
		 int num = 26;
	     	char ch = 'Z';	 
	    for(int i=1;i<=4;i++){
	        
	        for(int j =1;j<=4;j++){
		   if(j%2==1){
		    System.out.print(num+" ");
		    num--;
		   }
		   else{
		    System.out.print(ch+" ");
		     ch--;
		   }
		}
		System.out.println();
	    }
      }
      }
