//minimum distance between two elements
import java.util.Scanner;

class Array_Demo{

		static void minDistance(int arr[],int size,int num1,int num2){
				
			int ind1 = 0;
			int ind2 = 0;
			int flag1 = 0;
			int flag2 = 0;
				for(int i=0;i<size;i++){
					if(arr[i]==num1){
						ind1=i;
						flag1 = 1;
					}
					if(arr[i]==num2){
						ind2 = i;
						flag2 = 1;
						break;
					}
				}
				if(flag1 == 1 && flag2==1)
					System.out.println("minimum distance is : "+(ind2-ind1));
				else
					System.out.println("-1");
		
		}
	public static void main(String args[]){
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		System.out.println("enter elements in array");
		int arr[] = new int[size];

		for(int i = 0;i<size;i++){
		
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		minDistance(arr,size,num1,num2);
	}
}
