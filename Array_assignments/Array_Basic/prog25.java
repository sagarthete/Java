//maximum product of two numbers

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
		int prod = arr[0]*arr[1];
		for(int i=0;i<size;i++){
				
			for(int j=i+1;j<size;j++){
					
				int p = arr[i]*arr[j];
				if(p>prod)
					prod = p;
			}
		}
		System.out.println("product is :"+prod);

	}
 
 }
 
