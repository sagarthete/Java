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
		  int min = 0;
		
		for(int i=0;i<arr.length-1;i++){
		     if(arr[i]<arr[i+1])
			   min = arr[i];
		     else
			   min = arr[i+1]..;   
		} 
	        System.out.println("minimum element from array :- "+min);	

	 }  


   }

