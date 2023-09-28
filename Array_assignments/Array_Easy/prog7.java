import java.util.Scanner;

class Array_Demo{

		static void checkSorted(int arr[],int size){
			
			int flag = 0;
			int asc = 0;
			if(size>2){
				if(arr[0]>arr[1])
					asc = 1;
				else
					asc = 2;

				if(asc == 1){
					for(int i=1;i<size;i++){
						if(arr[i]<=arr[i+1])
							flag = 1;
						break;
					}
				}
				else{
					for(int i=1;i<size;i++){
						if(arr[i]>=arr[i+1])
							flag = 1;
							break;
					}
				
				
				}
			}
			else{
				flag = 0;
			}
			if(flag == 0)
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
		System.out.println("---------");
		checkSorted(arr,size);
	}
}
