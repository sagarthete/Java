class MergeSort{

	public static void main(String args[]){
	
		int arr1[] = new int[]{2,5,8,9};
		int arr2[] = new int[]{3,4,6};
		
		int n = arr1.length+arr2.length;

		int arr3[] = new int[n];
		
		int i = 0,j=0,k=0;

		while(i<arr1.length && j<arr2.length){
		
			if(arr1[i]<arr2[j]){
				arr3[k] = arr1[i];
				i++;
			}else{
				arr3[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length){
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length){
			arr3[k] = arr2[j];
			j++;
			k++;
		}

		for(int x = 0;x<arr3.length;x++){
			System.out.print(arr3[x]+" ");
		}
		System.out.println();
	}
}
