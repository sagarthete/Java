// simple code of bubble sort

class SortingAlgo{

	public static void main(String args[]){
	
		int arr[] = new int[]{3,4,2,6,7,5,9};

		for(int i=0;i<arr.length;i++){
			for(int j = 0;j<arr.length-1;j++){
				
				if(arr[j]>arr[j+1]){
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

				}
			}
		}
		System.out.println("sorted array is..");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
