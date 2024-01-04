class SortingAlgo{

	public static void main(String args[]){
		int count = 0;
		//int arr[] = new int[]{4,3,6,2,7,8,5};
		//int arr[] = new int[]{4,3,6,2,7,8,5};
		int arr[] = new int[]{2,3,4,5,6,7,8};

		for(int i = 0;i<arr.length;i++){
			int flag = 0;
			for(int j = 0;j<arr.length-i-1;j++){
				count++;
				if(arr[j]>arr[j+1]){
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag==0)
				break;
		}
		System.out.println("sorted array is..");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("no of iterations are = "+count);
	}
}
