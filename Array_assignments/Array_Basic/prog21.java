//first element that occures k times

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
		
		System.out.println("enter k");
		int k = Integer.parseInt(br.readLine());
		
		
		int last = size;
		for(int i = 0;i<size;i++){
			int temp = 0;
			int count = 0;
			for(int j = 0;j<size;j++){
			
				if(arr[i]==arr[j]){
					count++;
					if(count==k)
						temp = j;
				}
			}
			if(temp<last)
				last = temp;
		}
		
		System.out.println("first element that occures first time : "+arr[last]);
	}
 
 }
 
