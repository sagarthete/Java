/* 1
 * 3  4
 * 6  7  8
 * 10 11 12 13
 * 15 16 17 18 19
  */
    import java.io.*;
    class Pattern{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter row number");
		 int row = Integer.parseInt(br.readLine());
                 int num = 1; 
                 
                 for(int i=0;i<row;i++){
		 
		     for(int j = i;j>=0;j--){
		     
		       System.out.print(num+" ");
		       num++;
		     }
		        System.out.println();
			num++;
		 }
	   }
   }
