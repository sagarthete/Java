//left most and right most elements

import java.util.Scanner;

class Array_Demo{

	static void terminalIndex(int arr[],int ele){
	
		System.out.println("--------");
		int left = 0;
		int right =0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ele){
				left = i;
				break;
			}
		}
		for(int i = 0;i<arr.length;i++){
			if(arr[i]==ele){
				right = i;
			}
		}
		System.out.println("left most : "+left);
		System.out.println("right most : "+right);
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
		
		System.out.println("enter the element");
		int ele = sc.nextInt();

		terminalIndex(arr,ele);
	}
}
