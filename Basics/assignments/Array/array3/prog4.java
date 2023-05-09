
 // to find composite number from array 
    
   import java.io.*;
   class ArrayDemo{
   
         public static void main(String args[])throws IOException{
	  
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               System.out.println("enter size");
 	       int size = Integer.parseInt(br.readLine());

	        int arr[] = new int [size];

		System.out.println("enter the elements");
		for(int i =0;i<arr.length;i++){
		
		   arr[i] = Integer.parseInt(br.readLine());

		}
		System.out.println("composite numbers are");
		 for(int i = 0;i<arr.length;i++){
		 
		     int count = 0;
		     int num = arr[i];
		      for(int j=2;j<num/2;j++){
		         if(num%j==0){
			   count++;
			   break;
			 }
		      }
		      if(count==1){
		        System.out.println(num);
		      }
		 }


	 }
   }
