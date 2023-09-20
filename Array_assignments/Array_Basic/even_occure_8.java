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
		int even[] = new int[size];
		int flag = 0;
		System.out.println("_____answer_____");
		for(int i = 0;i<size;i++){
		
			int count = 0;
			for(int j = i;j<size;j++){
			
				if(arr[i]==arr[j]){
					count++;
					flag = 1;
				}
			}
			if(count%2==0)
				System.out.println(arr[i]);
		}
		if(flag == 0)
			System.out.println("-1");
	}
 
 }
 
