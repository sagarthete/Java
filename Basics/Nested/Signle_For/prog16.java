/* 1
 * 2 c
 * 4 e 6
 * 7 h 9 j
 */
    import java.util.Scanner;
    class Nested{
          
          public static void main(String sagar[]){
	  
		Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
	        int row = s.nextInt();	
	        System.out.println(); 
		int num = 1;
		 int x=1;
		 char ch = 'a';
		 int count = 0;
 		for(int i=1;i<=x;i++){
		   if(i%2==1){
	           System.out.print(num+ " ");
		   }
		   else{
		     System.out.print(ch+" ");
		   }
		   num++;
		   ch++;
		    if(i==x){
		       x++;
		       System.out.println();
		       i = 0;
		       count++;
                     }
		    if(count==row){
		      break;
		    }
		}
	  }
    }
