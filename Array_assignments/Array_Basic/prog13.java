//search for unique element

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

		int uni[] = new int[size];
		int ind = 0;
		int cnt = 0;
		int flag = 0;
		for(int i = 0;i<size;i++){
			int count = 0;
			for(int j = 0;j<size;j++){
			
				if(arr[i]==arr[j])
					count++;
			}
			if(count!=k){
				uni[ind] = arr[i];
				flag=1;
				ind++;
				cnt++;
			}
		}
		System.out.println("........");
		if(flag==1){
			for(int i = 0;i<cnt;i++){
		
				System.out.println(uni[i]);
			}
		}
		else{
			System.out.println("no unique element");
		
		}
	}
 
 }
 
