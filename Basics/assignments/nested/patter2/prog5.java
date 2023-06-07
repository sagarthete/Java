/* A B C D
 * B C D
 * C D
 * D		
*/
    import java.io.*;
    class Pattern{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter row number");
		 int row = Integer.parseInt(br.readLine());
                 
                 
                 for(int i=0;i<row;i++){
		 
		     for(int j = i+1;j<=row;j++){
		     
		       System.out.print((char)(j+64)+" ");
		     }
		        System.out.println();
		 }
	   }
   }
