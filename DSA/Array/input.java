import java.util.*;

class ArrayDemo{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of an array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("enter array elements");
		for(int i = 0;i<size;i++){
			arr[i] = sc.nextInt();
		}

	}
}
