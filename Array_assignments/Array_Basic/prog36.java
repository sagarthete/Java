//search element from the array

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
		int first = 0;
		int last = 0;
		int mid = 0;
		for(int i=0;i<size;i++){
			if(i==0 && arr[0]>arr[1]){
				first = arr[0];	
			}else if(i==size-1 && arr[size-1]>arr[size-2]){
				last = arr[size-1];
			}
			else if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
				mid = arr[i];
			}
		}
		if(last!=0)
			System.out.println(last);
		if(first!=0)
			System.out.println(last);
		if(mid!=0)
			System.out.println(last);

	}
 
 }
 
