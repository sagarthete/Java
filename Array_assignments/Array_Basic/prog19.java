//commen elements from three arrays without ascending order

 import java.io.*;

 class ArrayDemo{
 
 	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the size of first array");
		int size1 = Integer.parseInt(br.readLine());
		int arr1[] = new int[size1];
		System.out.println("enter the elements in acsending order in first array");

		for(int i = 0;i<size1;i++){
		
			arr1[i] = Integer.parseInt(br.readLine());

		}
		
		System.out.println("enter the size of second array");
		int size2 = Integer.parseInt(br.readLine());
		int arr2[] = new int[size2];
		System.out.println("enter the elements in acsending order in second array");

		for(int i = 0;i<size2;i++){
		
			arr2[i] = Integer.parseInt(br.readLine());
 
		}

		System.out.println("enter the size of third array");
		int size3 = Integer.parseInt(br.readLine());
		int arr3[] = new int[size3];
		System.out.println("enter the elements in acsending order in third array");
		
		for(int i = 0;i<size3;i++){
		
			arr3[i] = Integer.parseInt(br.readLine());

 		}

		System.out.println("--------------");
		for(int i = 0;i<size1;i++){
		
			for(int j = 0;j<size2;j++){
			
				for(int k = 0;k<size3;k++){
				
					if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
						System.out.println(arr1[i]);
					}
				}
			}
		}
	}
 }
 
