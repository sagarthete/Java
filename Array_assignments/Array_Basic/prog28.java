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
		int s = 0;
		for(int i =0;i<size;i++){
			int count = 0;
			int ind = 0;
			for(int j = 0;j<size;j++){
				if(arr[i]==arr[j]){
					count++;
					ind = j;
				}
			}
			if(count>=2){
				for(int k = ind;k<size-1;k++){
					if(k==size-2){
						arr[k+1] = 0;
						s++;
					}
					else{
						arr[k] = arr[k+1];
					}	
				}
			}

		}
		System.out.println("array is .....");
		for(int i = 0;i<size;i++)
			System.out.println(arr[i]);
	}
 
 }
 
