//odd index have odd element and same for even

import java.util.Scanner;

class Array_Demo{

	static void replace(int arr[]){
	
		int arr1[] = new int[arr.length];
		int e = 0;
		int o = 1;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){
				arr1[e] = arr[i];
				e = e+2;
			}
			else{
				arr1[0] = arr[i];
				o = o+2;
			}
		}
		System.out.println("-------------");
		for(int i = 0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements in specific order");

		for(int i = 0;i<size;i++){
		
			arr[i] = sc.nextInt();
		}
		replace(arr);
	}
}
