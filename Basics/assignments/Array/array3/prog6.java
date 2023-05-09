
 // to print the perfect numbers from array 
     
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
		System.out.println("perfect numbers are");
                for(int i=0;i<arr.length;i++){
		    int sum =0;
		      for (int j=1;j<=arr[i]/2;j++){
		          if(arr[i]%j==0){
			    sum = sum + j;
			  }
		        }
                      if(sum==arr[i])
			      System.out.println(arr[i]);
		      }
		}
	 }
   
