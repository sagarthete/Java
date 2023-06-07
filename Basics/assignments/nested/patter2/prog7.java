/* F
 * E 1
 * D 2 E
 * C 3 D 4
 * B 5 C 6 D
 * A 7 B 8 C 9
  */
    import java.io.*;
    class Pattern{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter row number");
		 int row = Integer.parseInt(br.readLine());
                 int num = 1;
                 
                 for(int i=1;i<=row;i++){
		      char ch = (char)(65+row-i);
		     for(int j = 1;j<=i;j++){
		     
	                 if(j%2==1)
			    System.out.print((ch++)+" ");
			 
	                 else
			    System.out.print((num++)+" ");
		        		 
		     }
		        System.out.println();
		 }
	   }
   }
