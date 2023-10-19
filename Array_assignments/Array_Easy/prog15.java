// union of two sorted arrays

import java.util.Scanner;
class Array_Demo{

		static void union(int arr1[],int arr2[],int size1,int size2){
				
			int i = 0;
			int j = 0;
			int uni[] = new int[size1+size2];
			while(i<size1 && j<size2){
				
			}
		}
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the sizes of both array");
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();

		System.out.println("enter elements in first array");
		int arr1[] = new int[size1];
		for(int i = 0;i<size1;i++){
		
			arr1[i] = sc.nextInt();
		}
		System.out.println("enter elements of second array");
		int arr2[] = new int[size2];
		for(int i = 0;i<size2;i++){
		
			arr2[i] = sc.nextInt();
		}
		intersection(arr1,arr2,size1,size2);
	}
}
