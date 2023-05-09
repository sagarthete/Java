
 // to print the count of the digit of numbers in array
    
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
	        System.out.println("number of digits sequentially are");
		for(int i = 0;i<arr.length;i++){
		
	 	  int num = arr[i];
		   int count = 0;
		      
		       while(num!=0){
		           count++;
			   num=num/10;
		       }
		     System.out.println(count);  
		}	

	 }
   }
