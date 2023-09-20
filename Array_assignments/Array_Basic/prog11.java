//product of maximum of one array and minimum of second array

 import java.io.*;

 class ArrayDemo{
 
 	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of an array");
		int size = Integer.parseInt(br.readLine());
		
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		System.out.println("enter the elements for first array");

		for(int i = 0;i<size;i++){
		
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("enter the elements for second array");
		for(int i = 0;i<size;i++){
		
			arr2[i] = Integer.parseInt(br.readLine());
		}
		int max = arr1[0];
		int min = arr2[0];
		for(int i = 0;i<size;i++){
			
			if(arr1[i]>max)
				max = arr1[i];
			if(arr2[i]<min)
				min = arr2[i];
		}

		System.out.println("product is : "+(max*min));
	}
 
 }
 
