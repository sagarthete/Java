/*print uncommon elements of two arrays
 */
   import java.io.*;
   class ArrayDemo{
    
         public static void main(String sagar[])throws IOException{
	        
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                      
                  System.out.println("enter the size of 1");
		  int size = Integer.parseInt(br.readLine());
                  System.out.println("enter the size of 2");
		  int size1 = Integer.parseInt(br.readLine());
                 

		  int arr1[] = new int[size];
		  int arr2[] = new int[size1];

		  System.out.println("enter array1 elements");

		  for(int i=0;i<arr1.length;i++){
		     arr1[i] = Integer.parseInt(br.readLine());
		  }
		  
		  System.out.println("enter array2 elements");

		  for(int i=0;i<arr2.length;i++){
		     arr2[i] = Integer.parseInt(br.readLine());
		  }
                 
		  System.out.println("uncommon elements are");
		  for(int i=0;i<arr1.length;i++){
		      int flag = 0;
		     for(int j=0;j<arr2.length;j++){
		     
		         if(arr1[i]==arr2[j]){
			   flag = 1;
			   break;
			 }
		     }
		     if(flag==0){
		      System.out.println(arr1[i]);
		     }
		  }
		  for(int i=0;i<arr2.length;i++){
		      int flag = 0;
		     for(int j=0;j<arr1.length;j++){
		     
		         if(arr2[i]==arr1[j]){
			   flag = 1;
			   break;
			 }
		     }
		     if(flag==0){
		      System.out.println(arr2[i]);
		     }


	 }  


   }

   }
