 /* 1
  * 3 4
  * 6 7 8
  * 10 11 12 13
  * 15 16 17 18 19
  */
      import java.util.Scanner;
      class Nested{
       
            public static void main(String sagar[]){
	          
	              Scanner s = new Scanner(System.in);
		      System.out.println("enter rows");
		      int row = s.nextInt();
                      System.out.println();
		      int num = 1;
		     for(int i = 1;i<=row;i++){
		     
		         for(int j =1;j<=i ;j++){
			    
			     System.out.print(num+" ");
			     num++;
			  }
			 num++;
			 System.out.println();
		     } 
                   
        	  }
	   } 
      
