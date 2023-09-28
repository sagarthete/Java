//search element from the array

 import java.io.*;

 class ArrayDemo{
 
 	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of an array");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];

		System.out.println("enter the elements in array in sorted manner");

		for(int i = 0;i<size;i++){
		
			arr[i] = Integer.parseInt(br.readLine());

		}
		System.out.println("enter the number");
		int num = Integer.parseInt(br.readLine());
	
		System.out.println("closest element is");
		int ele = 0;
		for(int i = 0;i<size-1;i++){
		
			if(arr[i]==num && arr[0]!=num && arr[size-1]!=num){
			
				if((arr[i+1]-num) > (num-arr[i-1]))
					ele = arr[i-1];
				else if((arr[i+1]-num) < (num-arr[i-1]))
					ele = arr[i+1];
				else
					System.out.println(arr[i+1]);
			}
			else if(arr[size-1]==num || arr[i]==arr[i+1]){
				ele = arr[size-2];
			}
			else if(arr[0]==num){
				ele = arr[1];
			}
		}
		System.out.println(ele);
	}
 
 }
 
