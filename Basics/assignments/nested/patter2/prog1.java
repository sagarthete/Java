/*c2w10
 *c2w9 c2w8
  c2w7 c2w6 c2w5
  c2w4 c2w3 c2w2 c2w1
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
		     
		        System.out.print("C2W"+num+" ");
			num--;
		     }
		        System.out.println();
		 }
	   }
   }
