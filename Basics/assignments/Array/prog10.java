/*merge two arrays into one array
 */
   import java.io.*;
   class ArrayDemo{
    
         public static void main(String sagar[])throws IOException{
	        
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      
                  System.out.println("enter the size of first array");
		  int size = Integer.parseInt(br.readLine());
                  
		  System.out.println("enter the size of second array");
		  int size1 = Integer.parseInt(br.readLine());
              
		  int arr1[] = new int[size];
                  int arr2[] = new int[size1];
		  int arr3[] = new int[size+size1];
		  System.out.println("enter array1 elements");

		  for(int i=0;i<arr1.length;i++){
		     arr1[i] = Integer.parseInt(br.readLine());
		     arr3[i] = arr1[i];
		  }
		  System.out.println("enter array2 elements");

		  for(int i=0;i<arr2.length;i++){
		     arr2[i] = Integer.parseInt(br.readLine());
		     arr3[size+i]=arr2[i];
		  }
		  System.out.println("the merged array is");
                  for(int i = 0;i<arr3.length;i++){
		     System.out.println(arr3[i]);
		  }

	 }  


   }
