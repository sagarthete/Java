//arrange array elements in pendulum arrangement

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
		for(int i=0;i<size;i++){
		
			for(int j=0;j<size-1;j++){
			
				if(arr[j+1]>arr[j]){
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = arr[j];
				}
			}
		}
		System.out.println("...............");
		int pend[] = new int[size];

		int prev = 0;
		int next = 0;
		for(int i = 0;i<size;i++){
			if(size%2==0){
				if(i==0){
					pend[(size/2)-1] = arr[i];
					next = size/2-1;
					prev = size/2-1;
				}

				else if(i%2!=0){
					next++;
					pend[next] = arr[i];
				}
				else{
					prev--;
					pend[prev] = arr[i];
				}
			}
		}
		System.out.println("arrangement is ___");
		for(int i = 0;i<size;i++){
		
			System.out.println(pend[i]);
		}
	}
 
 }
 
