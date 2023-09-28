//search element from the array

 import java.io.*;

 class ArrayDemo{

	static int[] sort(int []arr,int size){
	
		for(int i = 0;i<size;i++){
			for(int j=0;j<size-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	 static void minimumProduct(int arr[],int size,int k){
	 
	 	int arr1[] = sort(arr,size);
		int prod = 1;
		for(int i=0;i<k;i++){
			prod = prod*arr1[i];
		}
		System.out.println("prod is : " +prod);
	 }
 
 	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of an array");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];

		System.out.println("enter the elements in array");

		for(int i = 0;i<size;i++){
		
			arr[i] = Integer.parseInt(br.readLine());

		}
		System.out.println("enter k");
		int k = Integer.parseInt(br.readLine());
		minimumProduct(arr,size,k);
	}
 
 }
 
