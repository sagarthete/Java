//product of sum of left and right subarrays

 import java.io.*;

 class ArrayDemo{
 
 	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of an array");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];

		System.out.println("enter the elements in array");

		for(int i = 0;i<size;i++){
		
			arr[i] = Integer.parseInt(br.readLine());

		}
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0;i<size;i++){
		
			if(i<(size/2))
				sum1 = sum1 + arr[i];
			else
				sum2 = sum2 + arr[i];
		}
		System.out.println("product is : "+(sum1*sum2));
	}
 
 }
 
