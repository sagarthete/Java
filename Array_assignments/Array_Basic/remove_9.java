
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
		System.out.println("enter index");
		int ind = Integer.parseInt(br.readLine());

		for(int i = ind;i<size-1;i++){
		
			arr[i] = arr[i+1];
		}
		System.out.println("array is....");
		for(int i=0;i<size-1;i++){
		
			System.out.println(arr[i]);
		}
	}
 
 }
 
