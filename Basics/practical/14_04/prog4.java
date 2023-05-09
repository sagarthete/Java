// to print the odd numbers in regular and even in reverse order

   import java.io.*;
   class pattern{
   
          public static void main(String sagar[])throws IOException{
	      
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter range");
		 int start = Integer.parseInt(br.readLine());
		 int end = Integer.parseInt(br.readLine());
		  
		 System.out.println("even numbers are");
		 for(int i=end;i>=start;i--){
		   if(i%2==0){
		     System.out.print(i+" ");
		   }
		 }
		  System.out.println();
		 System.out.println("odd numbers are");
		 for(int i=start;i<=end;i++){
		   if(i%2==1){
		     System.out.print(i+" ");
		   }
		}
		System.out.println();
	  }
   }
