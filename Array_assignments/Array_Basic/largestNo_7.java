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
		}
		for(int i = 0;i<size;i++){
		
			for(int j = 0; j<size-1;j++){
			
				if(arr[j]<arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("number is ");
		for(int i = 0;i<size;i++){
			System.out.print(arr[i]);
		}
	}
 
 } 
