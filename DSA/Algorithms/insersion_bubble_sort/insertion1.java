//simple insertion sort

class SortingAlgo{

	public static void main(String args[]){
	
		int arr[] = new int[]{2,4,3,5,7,1,8};

		for(int i = 1;i<arr.length;i++){
		
			int ele = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>ele){
			
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = ele;
		}
		System.out.println("sorted array is...");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
