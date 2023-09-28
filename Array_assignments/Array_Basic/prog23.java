//smallest and second smallest element in array

 import java.io.*;

 class ArrayDemo{
 
 	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of an array");
		int size = Integer.parseInt(br.readLine());
		
		int arr[] = new int[size];

		System.out.println("enter the elements in array");

		
		for(int i = 0;i<size;i++){
		
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		int small = arr[0];
		int small2 = 60000;
		for(int i = 0;i<size;i++){
			if(small>arr[i]){
				small = arr[i];
			}
		}
		for(int i = 0;i<size;i++){
			if(small2>arr[i] && arr[i]!=small){
				small2 = arr[i];
			}
		}

		System.out.println("smallest ele is : "+small);
		System.out.println("second smallest ele is : "+small2);
		System.out.println(Integer.MAX_VALUE);

	}
 
 }
 
