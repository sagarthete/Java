/*  A b C d
 *  E f G h
 *  I j K l
 *  M n O p
 */

      class Nested{
      
	   public static void main(String sagar[]){
              
		 char ch1 = 'A';
	         char ch2 = 'a';	 
	    for(int i=1;i<=4;i++){
	         
	        for(int j =1;j<=4;j++){
		   if(j%2==1){
		   System.out.print(ch1+" ");
		   }
		   else{
		   System.out.print(ch2+" ");
		   
		   }
		   ch1++;
		   ch2++;
		
		
	    }
	    System.out.println();
      }
      }
      }
