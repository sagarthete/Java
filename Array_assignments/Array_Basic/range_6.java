//search element from the array

 import java.io.*;


 class ArrayDemo{
 
 	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of an array");
		int size = Integer.parseInt(br.readLine());
		
		System.out.println("enter range");
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
			
		int arr[] = new int[size];

		System.out.println("enter the elements in array");
		int flag = 0;
		for(int i = 0;i<size;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]>=A && arr[i]<=B)
				flag = 1;
		}
		if(flag == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	
	}
 
 }
 
