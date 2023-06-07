/*10
 *10 9
  9  8 7
  7 6 5 4 
  */
    import java.io.*;
    class Pattern{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter row number");
		 int row = Integer.parseInt(br.readLine());
                 int num = row*(row+1)/2;
                 
                 for(int i=0;i<row;i++){
		 
		     for(int j = i;j>=0;j--){
		     
		       System.out.print(num+" ");
		       num--;
		     }
		        System.out.println();
			num++;
		 }
	   }
   }
