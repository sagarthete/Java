/*find minimum element form array
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
		  int max = arr[0];

		  for(int i=0;i<arr.length;i++){
		      if(arr[i]>max){
		         max = arr[i];
		      } 

		  }
		  System.out.println("maximum elements are:-"+max); 

	 }  


   }

