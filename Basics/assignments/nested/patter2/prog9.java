/* 1
 * 8  9
 * 27 16 125
 * 64 25 216 49
  */
    import java.io.*;
    class Pattern{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter row number");
		 int row = Integer.parseInt(br.readLine());
                                  
                 for(int i=1;i<=row;i++){
                     int num = i;
		 
		     for(int j = 1;j<=i;j++){
		     
		       if(j%2==1){
			       System.out.print(num*num*num+" ");
		       }     
		       else{
			       System.out.print(num*num+" ");
		       }
		       num++;
		     }
		        System.out.println();
		 }
	   }
   }
