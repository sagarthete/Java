 /* 10 10 10 10
  * 11 11 11
  * 12 12
  * 13
  */
      import java.util.Scanner;
      class Nested{
       
            public static void main(String sagar[]){
	          
	              Scanner s = new Scanner(System.in);
		      System.out.println("enter rows");
		      int row = s.nextInt();
                      System.out.println();
		      
		     for(int i = 1;i<=row;i++){
		     
		         for(int j =i;j<=row ;j++){
			    
			     System.out.print((i+9)+" ");
			     
			  }
			 
			 System.out.println();
		     } 
                   
        	  }
	   } 
      