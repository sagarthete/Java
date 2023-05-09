 import java.io.*;
 class ArrayDemo{
       
	 public static void main(String sagar[]) throws IOException{
	 
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter size of an array");
                int size = Integer.parseInt(br.readLine());
                   
               float arr [] = new float[size];
	       	   num = Integer.parseInt(br.readLine());  
        
	       System.out.println("enter array elements");
                  
                 for(int i = 0;i<size;i++){
	       	   arr[i] = Integer.parseInt(br.readLine());  
		 }
                 System.out.println("array elements are");
               for(int i = 0;i<size;i++){
		   System.out.println(arr[i]);
		}		 
	 }
 }
