// find transition point
import java.util.Scanner;

class Array_Demo{

		static void transitionPoint(int arr[],int size){

				for(int i=0;i<size;i++){
					if(arr[i]==1){
						System.out.println("transition point is: "+i);
						break;
					}
				}
		
		}
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();

		System.out.println("enter 0s & 1s in sorted manner");
		int arr[] = new int[size];
		for(int i = 0;i<size;i++){
		
			arr[i] = sc.nextInt();
		}

		transitionPoint(arr,size);
	}
}
