//subarray with given sum

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
		System.out.println("enter sum");
		int sum = Integer.parseInt(br.readLine());
		
		int first = 0;
		int last = 0;
		int flag = 0;

		for(int i=0;i<size;i++){
			int add = 0;
			for(int j = i;j<size;j++){
				add = add + arr[j];
				if(add == sum){
					first = i;
					last = j;
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0)
			System.out.println("no subArray found");
		else
			System.out.println("subArray is from :" +first + " to "+last);

	}
 
 }
 
