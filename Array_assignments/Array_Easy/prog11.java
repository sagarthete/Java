// frequencies of limited range elements
import java.util.Scanner;

class Array_Demo{

		static void frequency(int arr[],int size,int p){

				int ind = 0;
				for(int i=1;i<=p;i++){
					int count = 0;
					for(int j=0;j<size;j++){
						if(arr[j]==i){
							count++;
						}
					}
					arr[ind]=count;
					ind++;
				}
				System.out.println("------");
				for(int i = 0;i<size;i++){
					System.out.println(arr[i]);
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

		System.out.println("enter last ele of range");
		int p = sc.nextInt();
		frequency(arr,size,p);
	}
}
