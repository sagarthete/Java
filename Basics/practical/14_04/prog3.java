/* 5 4 3 2 1
 * 8 6 4 2
 * 9 6 3
 * 8 4
 * 5
 */
     import java.util.Scanner; 
     class ArrayDemo{
     
           public static void main(String sagar[]){
	    
	          Scanner s = new Scanner(System.in);
		  System.out.println("enter number of rows");
		  int row = s.nextInt();
                  int num;
		  int n = row;
		  for(int i = 1;i<=row;i++){
		      num = n*i;
		      for(int j=row;j>=i;j--){
		         System.out.print(num+" ");
			 num=num-i;
		      }
			System.out.println();
			n--;
		  }  
	   }
     }
