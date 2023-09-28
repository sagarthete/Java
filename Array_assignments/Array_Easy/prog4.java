//coutn pair with given sum
import java.util.Scanner;

class Array_Demo{

		static void findPairSum(int arr[],int size,int sum){

			int count = 0;
			for(int i=0;i<size;i++){
				
				for(int j=i;j<size;j++){
					if((arr[i]+arr[j])==sum)
						count++;
				}
			}
			System.out.println(count);
		
		}
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();

		System.out.println("enter the elements in array");
		int arr[] = new int[size];
		for(int i = 0;i<size;i++){
		
			arr[i] = sc.nextInt();
		}

		System.out.println("enter sum");
		int sum = sc.nextInt();
		
		System.out.println("count is..");
		findPairSum(arr,size,sum);
	}
}
