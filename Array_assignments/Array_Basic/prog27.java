//check pair sum of two differnt arrays

 import java.io.*;

 class ArrayDemo{
 
 	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of an array");
		int size = Integer.parseInt(br.readLine());
		
		int arr1[] = new int[size];
		int arr2[] = new int[size];

		System.out.println("enter the elements in first array");

		for(int i = 0;i<size;i++){
		
			arr1[i] = Integer.parseInt(br.readLine());

		}
		System.out.println("enter elements in second array");
		for(int i = 0;i<size;i++){
		
			arr2[i] = Integer.parseInt(br.readLine());

		}
		System.out.println("enter sum");
		int sum = Integer.parseInt(br.readLine());

		for(int i = 0;i<size;i++){
			int add = 0;
			for(int j = 0;j<size;j++){
				add = arr1[i]+arr2[j];
				if(sum == add){
					System.out.println(arr1[i]+" & "+arr2[j]);
				}	
				
			}
		}

	}
 
 }
 
