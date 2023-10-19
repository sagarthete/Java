//find all pairs of given sum

import java.util.Scanner;

class Array_Demo{

	static void pairSum(int arr1[],int arr2[],int size1,int size2,int sum){
	
		for(int i = 0;i<size1;i++){
			for(int j = 0;j<size2;j++){
				if((arr1[i]+arr2[j])==sum){
					System.out.println(arr1[i] +" & "+arr2[j]);
				}
			}
		}
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of both arrays");
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();

		int arr1[] = new int[size1];
		int arr2[] = new int[size2];

		System.out.println("enter the elements of first array");

		for(int i = 0;i<size1;i++){
		
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter the elements of second array");

		for(int i = 0;i<size2;i++){
		
			arr2[i] = sc.nextInt();
		}
		System.out.println("enter sum");
		int sum = sc.nextInt();
		pairSum(arr1,arr2,size1,size2,sum);
	}
}
