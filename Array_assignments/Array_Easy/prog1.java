import java.util.Scanner;

class Array_Demo{

		static void findMissElement(int arr[],int size){

			System.out.println("missing elements are....");
			for(int i=1;i<=size;i++){
				int flag = 0;
				for(int j=0;j<size;j++){
					if(i==arr[j])
						flag = 1;
				}
				if(flag == 0)
					System.out.println(i);
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

		findMissElement(arr,size);
	}
}
