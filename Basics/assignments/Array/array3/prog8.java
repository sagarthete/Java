
 // to print the strong number from array
    
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
		System.out.println("strong numbers are");
		 for(int i = 0;i<arr.length;i++){
		      int num = arr[i];
		      int sum = 0;
                          while(num!=0){
			     int rem = num%10;
			     int fact = 1;
			         for(int k=rem;k>=1;k--){
				    fact = fact*k;
				 }
				num = num/10; 
				sum = sum + fact; 
			  }	
	                if(sum==arr[i])
                          System.out.println(arr[i]);			
		 }

	 }
   }
