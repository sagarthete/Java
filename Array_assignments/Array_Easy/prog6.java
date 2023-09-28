// find second large 
import java.util.Scanner;

class Array_Demo{

		static void secondLarge(int arr[],int size){

			int large = 0;
			int large2 = 0;
			for(int i=0;i<size;i++){
			
				if(arr[i]>large){
					large2 = large;
					large = arr[i];
				}
				if(arr[i]>large2 && arr[i]!=large)
					large2 = arr[i]; 
			}
			System.out.println("large : "+large);
			System.out.println("second large: "+large2);		
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

		secondLarge(arr,size);
	}
}
