 //take array from user and print no divisible by 5
 
import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int x=sc.nextInt();
		int arr[]=new int[x];
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("element divisible by 5:");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
				System.out.println(arr[i]);
			}
		}
	}
}
