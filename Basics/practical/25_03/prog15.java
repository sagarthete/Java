 /* A B C D
  * B C D
  * C D
  * D
  */
      import java.util.Scanner;
      class Nested{
       
            public static void main(String sagar[]){
	          
	              Scanner s = new Scanner(System.in);
		      System.out.println("enter rows");
		      int row = s.nextInt();
                      System.out.println();
		      
 		      for(int i = 1;i<=row;i++){
		          char ch = (char)(64+i);
		         for(int j =i;j<=row ;j++){
			    
			     System.out.print(ch+" ");
			     ch++;
			  }
			 System.out.println();
		     } 
                   
        	  }
	   } 
      
