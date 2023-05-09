/*search specific elements from array anf print its index
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
	 }  


   }
