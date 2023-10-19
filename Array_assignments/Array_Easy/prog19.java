//elements with left side smaller and right size greater

import java.util.Scanner;

class Array_Demo{

	static void hikeElement(int arr[]){
	
		int flag = 0;
		System.out.println("--------");
		for(int i = 1;i<arr.length-1;i++){
			if(arr[i]>arr[i-1] && arr[i]<arr[i+1]){
				System.out.println(arr[i]);
				flag = 1;
			}
		}
		if(flag!=1)
			System.out.println("-1");
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
		hikeElement(arr);
	}
}
