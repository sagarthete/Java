 /* c2w10
  * c2w9 c2w8 
  * c2w7 c2w6 c2w5 
  * c2w4 c2w3 c2w2 c2w1
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
			    
			     System.out.print("C2W"+num+" ");
			     num--;
			  }
			 System.out.println();
		     } 
                   
		      
		  }
	    } 
      
