/* 10
 * I H
 * 7 6 5 
 * D C B A
 */

   import java.io.*;

    class Pattern{
    
          public static void main(String sagar[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		  System.out.println("enter number of rows");
		  int row = Integer.parseInt(br.readLine());
		  int num = row*(row+1)/2;
		  char ch = (char)(64+num);

		 for(int i=1;i<=row;i++){
		     
	             for(int j=1;j<=i;j++){
		      
	               if(row%2==0){		     
		          if(i%2==1){
			     System.out.print(num+" ");
			  }
			  else{
			    System.out.print(ch+" ");
			  }
			  ch--;num--;
		       }
		       else{
		          if(i%2==0){
			     System.out.print(num+" ");
			  }
			  else{
			    System.out.print(ch+" ");
			  }
			  ch--;num--;
		       
		       
		       }
		
         	 }
		System.out.println(); 
	  }
    }
    }
