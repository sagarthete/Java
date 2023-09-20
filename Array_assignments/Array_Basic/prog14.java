//maximuim repeating number

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
		int max = 0;
		int next = 0;
		int ind = 0;
		int ele = 0;
		int flag = 0;

		for(int i=0;i<size;i++){
		
			int count = 0;
			for(int j = 0;j<size;j++){
			
				if(arr[i]==arr[j]){
				
					count++;
				}
			}
			if(count>max){
				flag = 1;
				max = count;
				ind = i;
				ele = arr[i];
			}
			if(count==max){
				flag = 2;
				next = arr[i];
			}
		}
		if(flag == 1){
		
			System.out.println("most occuring ele is : "+ele);
		}
		if(flag == 2){
		
			if(ele>next)
				System.out.println("most occuring ele is : "+next);
			else
				System.out.println("most occuring ele is : "+ele);

		}
	}
 
 }
 
