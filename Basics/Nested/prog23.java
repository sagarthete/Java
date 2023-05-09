/* 1
 * 4  3
 * 16 5 36
 * 49 8 81 10;
 */

         import java.util.Scanner;

	 class Nested{
	 
	       public static void main(String sagar[]){
	          
	               Scanner s= new Scanner(System.in);
		       System.out.println("enter rows");
		       int row = s.nextInt();
                       System.out.println();
                         int num = 1;  
		       for(int i = 1;i<=row;i++){
		     
		         for(int j = 1;j<=i;j++){
			    if(j%2==1){  
			     System.out.print(num*num +" ");
			    
			 }
			 else{
			    System.out.print(num+" ");
			 }
			num++;
		      }	
		      System.out.println();
		     }
	       }
	 }
