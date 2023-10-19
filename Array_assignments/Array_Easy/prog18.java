//throw zeros at the end

import java.util.Scanner;

class Array_Demo{

	static void moveZeros(int arr[],int size){
	
		for(int i = 0;i<size;i++){
		
			for(int j = 0;j<size-1;j++){
				if(arr[j]==0 && arr[j+1]!=0){
					arr[j] = arr[j+1];
					arr[j+1] = 0;
				}
			}
		}	
		System.out.println("array is....");
		for(int i = 0;i<size;i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements in array");

		for(int i = 0;i<size;i++){
		
			arr[i] = sc.nextInt();
		}
		moveZeros(arr,size);
	}
}
