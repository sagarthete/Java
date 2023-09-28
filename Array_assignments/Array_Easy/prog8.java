//rotate array by D where D is positive integer
import java.util.Scanner;

class Array_Demo{

		static void rotateArray(int arr[],int size,int D){
			
			for(int i=0;i<D;i++){
				int ele = arr[0];
				for(int j = 0;j<size-1;j++){
					if(j==size-2){
						arr[j] = arr[j+1];
						arr[j+1]=ele;
					}
					else{
						arr[j] = arr[j+1];
					}
				}
			}
			for(int i=0;i<size;i++){
				System.out.print(arr[i]+" ");
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

		System.out.println("enter D");
		int D = sc.nextInt();
		System.out.println("---------");
		rotateArray(arr,size,D);
	}
}
