/* 10
 * I H
 * 7 6 5
 * D C B A
  */
    import java.io.*;
    class Pattern{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter row number");
		 int row = Integer.parseInt(br.readLine());
                 int num = row*(row+1)/2;
                 char ch = (char)(64+num);		 
                 
                 for(int i=1;i<=row;i++){
                       		 
  		     for(int j = 1;j<=i;j++){
		     
			if(i%2==1)
		     	  	System.out.print(num+" ");
	       		else
				System.out.print(ch+" ");

	                num--;
			ch--;
                    } 
		     System.out.println();
		 }
	   }
   }
