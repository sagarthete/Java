//search element from the array

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
			if(arr[i]==0)
				arr[i] = 5;
		}

		for (int i = 0;i<size;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
 
 }
 