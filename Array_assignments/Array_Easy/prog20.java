//Bitonic point : maximum element in array which is strictly increasing firstly and the Strictly deceasing

import java.util.Scanner;

class Array_Demo{

	static void bitonicPoint(int arr[]){
	
		int max = 0;
		int flag = 0;
		System.out.println("--------");
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				max = arr[i+1];
				flag = 1;
			}
		}
		if(flag == 0)
			System.out.println("the last element of array is greater");
		else
			System.out.println("max is : "+max);
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
		bitonicPoint(arr);
	}
}
