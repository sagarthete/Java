/* 1
 * 2 3
 * 3 4 5
 * 4 5 6 7
  */
    import java.io.*;
    class Pattern{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter row number");
		 int row = Integer.parseInt(br.readLine());
                
                 
                 for(int i=1;i<=row;i++){
		      int num = i;
		     for(int j = i;j>0;j--){
		     
		       System.out.print((num++)+" ");
		     }
		        System.out.println();
		 }
	   }
   }
