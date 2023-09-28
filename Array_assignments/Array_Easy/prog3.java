// find duplicate ele in array
import java.util.Scanner;

class Array_Demo{

		static void findDuplicate(int arr[],int size){

			for(int i=0;i<size;i++){
				int count = 0;
				for(int j = i;j<size;j++){
					if(arr[i]==arr[j])
						count++;
				}	
				if(count>=2)
					System.out.println(arr[i]);
			}		
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
		System.out.println("duplicates are...");
		findDuplicate(arr,size);
	}
}
