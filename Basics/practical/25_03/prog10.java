 /* 1 2 3 4
  * 4 5 6 
  * 6 7 
  * 7
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
		     
		         for(int j =1;j<=row-i+1 ;j++){
			    
			     System.out.print(num+" ");
			     num++;
			  }
			 num--;
			 System.out.println();
		     } 
                   
        	  }
	   } 
      
