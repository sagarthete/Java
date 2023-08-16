package ArrayPack;

import java.util.*;

public class ArrayDemo{
 
 	public void search(){
	
	       int arr[] = {10,20,30,40,50,60};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number to search");
		int num = sc.nextInt();
		int flag = 0;

		for(int i = 0;i<arr.length;i++){
		
			if(num==arr[i])
				flag = 1;
			else
				flag = 0;
		}
		if(flag == 0)
			System.out.println("found");
		else
			System.out.println("not found");
		
	}	

	public void sort(){
	
		int arr[] = {10,40,20,50,15,25,30};
		
		System.out.println("the array to be sort is :");
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+",");
		}
			
		for(int i=0;i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
			
				if(arr[i]>=arr[j]){
				
					int num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
			}
		}
 		System.out.println();
		System.out.println("sorted array is :");
		for(int i=0;i<arr.length;i++){
		
			System.out.print(arr[i]+",");
		}

 		System.out.println();

	}
 }


