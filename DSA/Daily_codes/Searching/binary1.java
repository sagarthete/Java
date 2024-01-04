import java.util.*;
class BinarySearch{

	static int search(int arr[],int ele){
	
		int start = 0;
		int end = arr.length-1;

		while(start<=end){
		
			int mid = (start + end) /2;

			if(arr[mid]==ele)
				return mid;
			if(arr[mid]<ele)
				start = mid + 1;
			if(arr[mid]>ele)
				end = mid -1;
		}
		return -1;
	}
	public static void main(String args[]){
	
		int arr[] = new int[]{7,12,18,23,28,34,36,45,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to be search");

		int num  = sc.nextInt();
		int ret = search(arr,num);
		if(ret==-1)
			System.out.println("element not found");
		else
			System.out.println("element found at : "+ret);
	}
}
