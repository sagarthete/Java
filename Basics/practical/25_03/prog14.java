 /* 1 2 3 4
  * 2 3 4
  * 3 4
  * 4
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
		         for(int j =i;j<=row ;j++){
			    
			     System.out.print(num+" ");
			     num++;
			  }
			 System.out.println();
		     } 
                   
        	  }
	   } 
      
