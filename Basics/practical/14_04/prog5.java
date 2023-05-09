/* 0
 * 1 1 
 * 2 3  5
 * 8 13 21 34
 */

   import java.util.Scanner;
   class Pattern{
   
         public static void main(String sagar[]){
	 
	        Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
                int row = s.nextInt();
            
                int a = 0;
		int b = 0;
		int c = b;

	        for(int i=1;i<=row;i++){
		
		   for(int j = 1;j<=i;j++){
		   
		       a = b;
		       b = c;
		       c = b;
		       System.out.print(c+" ");
		   }
		}	
	 }
   }
