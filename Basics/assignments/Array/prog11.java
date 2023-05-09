/* print the element of array whose digits sum is even
 */
   import java.io.*;
   class ArrayDemo{
    
         public static void main(String sagar[])throws IOException{
	        
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      
                  System.out.println("enter the size");
		  int size = Integer.parseInt(br.readLine());

		  int arr[] = new int[size];

		  System.out.println("enter array elements");

		  for(int i=0;i<arr.length;i++){
		     arr[i] = Integer.parseInt(br.readLine());
		  }

		  System.out.println("the required elements are");
		  for(int i=0;i<arr.length;i++){
		     int x = arr[i];
		     int sum = 0;

		      while(x!=0){
		         
			   int rem = x%10;
			   sum = sum+rem;
			   x = x/10;   
		      }
		     if(sum%2==0){
		       System.out.println(arr[i]);
		     } 
		  }
	 }  


   }
