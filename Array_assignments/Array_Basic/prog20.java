//finding pair of two sum

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
		
		int one = 0;
		int two = 0;
		for(int i = 0;i<size;i++){
			int add = 0;
			for(int j = i;j<size;j++){
				
				add = arr[i]+arr[j];
				if(add==sum){
					one = arr[i];
					two = arr[j];
				}
			}
		}
		System.out.println(one+" "+two);
	}
 
 }
 
