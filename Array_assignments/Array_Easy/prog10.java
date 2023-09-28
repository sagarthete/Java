// find first repeating element
import java.util.Scanner;

class Array_Demo{

		static void firstRepeated(int arr[],int size){
				
				int ind1 = 0; 
				int ind2 = 0; 
				for(int i=0;i<size;i++){
					int count = 0;
					for(int j=i;j<size;j++){
						if(arr[i]==arr[j]){
							count++;
							if(count==2){
								ind1 = j;
							}
						}
					}
						if(ind2<ind1){
							ind2 = ind1;
						}
				}
				System.out.println("first repeating element is : "+arr[ind1]);
		
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

		firstRepeated(arr,size);
	}
}
