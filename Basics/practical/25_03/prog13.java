 /* 10
  * 10 9
  * 9 8 7 
  * 7 6 5 4
  */
      import java.util.Scanner;
      class Nested{
       
            public static void main(String sagar[]){
	          
	              Scanner s = new Scanner(System.in);
		      System.out.println("enter rows");
		      int row = s.nextInt();
                      System.out.println();
		      int num = row*(row+1)/2;
		     for(int i = 1;i<=row;i++){
		         
		         for(int j =1;j<=i ;j++){
			    
			     System.out.print(num+" ");
			     num--;
			  }
			 num = num+1;
			 System.out.println();
		     } 
                   
        	  }
	   } 
      
