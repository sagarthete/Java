// fimd peak element
import java.util.Scanner;

class Array_Demo{

		static void findPeakEle(int arr[],int size){
			
			int ele = 0;
			for(int i=0;i<size-1;i++){
				if(i==0 && arr[0]>arr[1])
					ele = 0;
				else if(i==size-1 && arr[size-1]>arr[size-2])
					ele = size-1;
				else if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
					ele = i;
			}
				if(ele != 0)
					System.out.println("1");
				else
					System.out.println("0");
				
			}
		
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();

		System.out.println("enter the elements in array upto N range");
		int arr[] = new int[size];
		for(int i = 0;i<size;i++){
		
			arr[i] = sc.nextInt();
		}
		System.out.println("--------");
		findPeakEle(arr,size);
	}
}
