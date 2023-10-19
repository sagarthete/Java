//Facing the sun

import java.util.Scanner;

class Array_Demo{

	static void facingSun(int arr[]){
	
		int count = 0;
		int max = Integer.MIN_VALUE;
		System.out.println("--------");
		for(int i = 0;i<arr.length;i++){
		
			if(arr[i]>max){
				count++;
				max = arr[i];
			}
		}
		System.out.println("count is : "+count);
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
		facingSun(arr);
	}
}
