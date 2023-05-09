/* A 1 B 2
 * C 3 D
 * E 4
 * F
 */

         import java.util.Scanner;

	 class Nested{
	 
	       public static void main(String sagar[]){
	          
	               Scanner s= new Scanner(System.in);
		       System.out.println("enter rows");
		       int row = s.nextInt();
                       System.out.println();
                         int num = 1;
                         char ch = 'A';
		       for(int i = 1;i<=row;i++){
		     
		         for(int j = 1;j<=row-i+1;j++){
			    if(j%2==1){  
			     System.out.print(ch +" ");
			      ch++;
			 }
			 else{
			    System.out.print(num+" ");
			    num++;
			 }
			
		      }	
		      System.out.println();
		     }
	       }
	 }
