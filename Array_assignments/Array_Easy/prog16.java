//no of rotations in sorted array
import java.util.Scanner;

class Array_Demo{

	static void rotation(int arr[],int size){
	
		int count = 0;
		for(int i=0;i<size-1;i++){
		
			if(arr[i]>arr[i+1]){
				count++;
			}
		}
		System.out.println("no of rotation are : "+count);
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
		rotation(arr,size);
	}
}
