// take array from user and print the product  of even numbers

   import java.io.*;
   class ArrayDemo{
   
         public static void main(String sagar[])throws IOException{
	 
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 
                 System.out.println("enter size of an array");		
 		int arr [] = new int[Integer.parseInt(br.readLine())];
                  int prod =1;
                  System.out.println("enter the array elemets");
		  for (int i=0;i<arr.length;i++){
		  
		    arr[i] = Integer.parseInt(br.readLine());
                     if(arr[i]%2==0){
		       prod = prod*arr[i];
		     }
		  }
		  System.out.println("the product of even elements are:- "+prod);

	 }
   }
