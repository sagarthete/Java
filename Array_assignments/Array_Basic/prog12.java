//first and last occurence of elements

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
		
		System.out.println("enter element");
		int ele = Integer.parseInt(br.readLine());

		int first = 0;
		int last = 0;
		int flag = 0;
		for(int i = 0;i<size;i++){
		
			if(arr[i]==ele){
			
				if(first == 0){
				
					first = i;
					last = i;
					flag = 1;
				}
				else{
				
					last = i;
				}
			}
		}
		if(flag == 0){
			System.out.println("element not found");
		}
		else{
		
			System.out.println("first : "+first);
			System.out.println("last : "+last);
		}
	}
 
 }
 
