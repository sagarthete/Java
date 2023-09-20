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
		int ind = 0;
		int cnt = 0;
		System.out.println("_____answer_____");
		for(int i = 0;i<size;i++){
		
			int count = 0;
			for(int j = i;j<size;j++){
			
				if(arr[i]==arr[j]){
					count++;
					flag = 1;
				}
			}
			if(count%2==0){
				int f = 0;
				for(int k=0;k<size;k++){
				
					if(arr[i]==even[k])
						f = 1;
				}
				if(f==0){
					even[ind] = arr[i];
					ind++;
					cnt++;
				}
			}
		}
		if(flag == 0){
			System.out.println("-1");
		}
		else{
		
			for(int i = 0;i<cnt;i++){
			
				System.out.println(even[i]);
			}
		}
	}
 
 }
 
