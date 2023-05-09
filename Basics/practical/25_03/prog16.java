 /* 1
  * 2 3 
  * 3 4 5
  * 4 5 6 7
  */
      import java.util.Scanner;
      class Nested{
       
            public static void main(String sagar[]){
	          
	              Scanner s = new Scanner(System.in);
		      System.out.println("enter rows");
		      int row = s.nextInt();
                      System.out.println();
		      
 		      for(int i = 1;i<=row;i++){
		          int num=i;
		         for(int j =1;j<=i ;j++){
			    
			     System.out.print(num+" ");
			     num++;
			  }
			 System.out.println();
		     } 
                   
        	  }
	   } 
      
