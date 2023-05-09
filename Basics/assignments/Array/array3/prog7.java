
 // to reverse each element in array 
    
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
		System.out.println("reverse elemets are");
	         
	           for (int i=0;i<arr.length;i++){
		       int rem = 0;
		       int rev = 0;
		       int num = arr[i];
		       while(num!=0){
		          rem = num%10;
                          rev = rev*10+rem;
			  num = num/10;
		       }
		       if(arr[i] == rev)
		      System.out.println(arr[i]); 
		   }	

	 }
   }
