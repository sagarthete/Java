//odd exponetial

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
			int count = 0;
			for(int j = 0;j<size;j++){
			
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count%2!=0){
				System.out.println("odd Exponetial : "+arr[i]);
				break;
			}	
		}
	}
 
 }
 
 
