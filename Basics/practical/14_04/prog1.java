/* D4 C3 B2 A1
 * A1 B2 C3 D4
 * D4 C3 B2 A1
 * A1 B2 C3 D4
 */

      import java.io.*;
      class ArrayDemo{
      
            public static void main(String sagar[])throws IOException{
	    
	           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		        System.out.println("enter number of rows");
                   	
			 int row = Integer.parseInt(br.readLine());

			 int num = row;
			 char ch = (char)(64+row);
			
		   for(int i = 1;i<=row;i++){
		   
		      for(int j=1;j<=row;j++){
		      
		         if(i%2==1){
			    System.out.print(ch+""+num+" ");
			    ch--;
			    num--;
			 }
			 else{
			    System.out.print(ch+""+num+" ");
			    ch++;
			    num++; 
			 }
		      }
		      if(i%2==1){
		         ch++;
			 num++;
		      }
		      else{
		         ch--;
			 num--;
		      }
		    System.out.println();

		   }	 

	    }
       
      }

