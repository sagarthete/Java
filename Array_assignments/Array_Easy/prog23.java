//product of three greater elemnts

import java.util.Scanner;

class Array_Demo{

	static void threeGreater(int arr[]){
	
		System.out.println("--------");
		int one = Integer.MIN_VALUE;
		int two = Integer.MIN_VALUE;
		int three = Integer.MIN_VALUE;
		int prod = 1;
		if(arr.length>3){
		
			for(int i=0;i<arr.length;i++){
			
				if(arr[i]>one){
					three = two;
					two = one;
					one = arr[i];
				}
				if(arr[i]<one && arr[i]>two){
					three = two;
					two = arr[i];
				}
				if(arr[i]<one && arr[i]<two && arr[i]>three){
					three = arr[i];
				}
			}
			prod = one*two*three;
		}
		else{
		
			for(int i=0;i<arr.length;i++){
				prod = prod*arr[i];	
			}
		}
		System.out.println(one +" "+two+" "+three);
		System.out.println("product is : "+prod);
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
		threeGreater(arr);
	}
}
