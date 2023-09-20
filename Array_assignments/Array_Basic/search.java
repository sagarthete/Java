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

		System.out.println("enter the element to be searched");
		int ele = Integer.parseInt(br.readLine());
	
		int flag = 0;
		for(int i = 0;i<size;i++){
		
			if(ele==arr[i]){
				flag = i;
				break;
			}
			else{
				flag = 0;
			}
		}
		if(flag!=0){
		
			System.out.println("elements found at := "+flag);
		}
		else{
			System.out.println("element not found");
		}

	}
 
 }
 
