/* 1 2 3 4
 * 2 3 4
 * 3 4 
 * 4
*/
    import java.io.*;
    class Pattern{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter row number");
		 int row = Integer.parseInt(br.readLine());
                 
                 
                 for(int i=0;i<row;i++){
		 
		     for(int j = i+1;j<=row;j++){
		     
		       System.out.print(j+" ");
		     }
		        System.out.println();
		 }
	   }
   }
