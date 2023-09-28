// number of occurence
import java.util.Scanner;

class Array_Demo{

		static void occurence(int arr[],int size,int num){
				int count = 0;
				for(int i=0;i<size;i++){
					if(arr[i]==num)
						count++;
				}
				System.out.println("no of occurence is : "+count);
		
		}
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();

		System.out.println("enter elements in array");
		int arr[] = new int[size];
		for(int i = 0;i<size;i++){
		
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter number to find occurence");
		int num = sc.nextInt();

		occurence(arr,size,num);
	}
}
