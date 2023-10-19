//non repeating elements

import java.util.Scanner;

class Array_Demo{

	static void nonRepeateEle(int arr[]){
	
		System.out.println("--------");
		int flag = 0;
		for(int i=0;i<arr.length;i++){
			int count = 0;
			for(int j = 0;j<arr.length;j++){
				if(arr[j]==arr[i]){
					count++;
				}
			}
			if(count==1){
				System.out.println(arr[i]);
				flag = 1;
			}
		}
		if(flag == 0)
			System.out.println("0");
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
		nonRepeateEle(arr);
	}
}
