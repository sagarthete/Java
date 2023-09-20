//sum of distinct elements

 import java.io.*;
 import java.util.*;

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
		
		int add[] = new int[size];
		int flag = 0;
		int ind = 0;
		int cnt = 0;

		for(int i=0; i<size;i++){
			
			int count = 0;
			for(int j = 0;j<size;j++){
			
				if(arr[i]==arr[j]){
					int f = 0;
					for(int k = 0;k<size;k++){
						if(arr[i]==add[k])
							f = 1;
					}
					if(f!=1){
						add[ind] = arr[i];
						ind++;
						cnt++;
					}
				}
			}
			
		}
		int sum = 0;
		for(int i=0;i<cnt;i++){
			sum = sum+add[i];
		}
		System.out.println("sum is : "+sum);
 	}
 }
 
