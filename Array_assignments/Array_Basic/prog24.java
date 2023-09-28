//floor and ceil

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
		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());
		
		int i;
		for(i = 0;i<size;i++){
			if(num==arr[i])
				break;
		}
		System.out.println("ceil : "+arr[i-1]);
		System.out.println("floor : "+arr[i+1]);
	}
 
 }
 
