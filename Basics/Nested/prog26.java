/* 1
 * 2 c
 * 4 e 6
 * 7 h 9 j
 */

         import java.util.Scanner;

	 class Nested{
	 
	       public static void main(String sagar[]){
	          
	               Scanner s= new Scanner(System.in);
		       System.out.println("enter rows");
		       int row = s.nextInt();
                       System.out.println();
                         int num = 1;
                         char ch = 'a';
		       for(int i = 1;i<=row;i++){
		     
		         for(int j = 1;j<=i;j++){
			    if(j%2==1){  
			     System.out.print(num +" ");
			     
			 }
			 else{
			    System.out.print(ch+" ");
			   
			 }
			ch++;
			num++;
		      }	
		      System.out.println();
		     }
	       }
	 }
