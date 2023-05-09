/* # = = = = 
 * = # = = =
 * = = # = =
 * = = = # =
 * = = = = #
 */

   import java.util.Scanner;
   class ArrayDemo{
        
	 public static void main(String sagar[]){
	 
	        Scanner s = new Scanner(System.in);
		System.out.println("enter row number");
       		int row = s.nextInt();

		for(int i= 1;i<=row;i++){
		   
	     		for(int j = 1;j<=row;j++){
			
			    if(i==j){
			     System.out.print("# ");

			    }
			    else{
			      System.out.print("= ");
			     }
			}
	            System.out.println(); 	 	
		}

	 }
   }
