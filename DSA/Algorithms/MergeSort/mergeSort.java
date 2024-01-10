class MergeSort{

	void merge(int arr[],int mid,int start,int end){
	
		int n1 = mid-start+1;
		int n2 = end - mid;
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		for(int i=0;i<n1;i++){
			arr1[i] = arr[start+i];
		}
		for(int i = 0;i<n2;i++){
			arr2[i] = arr[mid+1+i];
		}
		
		int i = 0,j = 0,k=start;
		while(i<arr1.length && j<arr2.length){
		
			if(arr1[i]<arr2[j]){
				arr[k] = arr1[i];
				i++;
			}else{
			
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}

		while(i<arr1.length){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length){
			arr[k] = arr2[j];
			j++;
			k++;
		}

	}

	void mergeSort(int arr[],int start ,int end){
		
		if(start<end){
		
			int mid = start+end/2;

			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,mid);

			merge(arr,mid,start,end);
		}
	}
}
class client{

	public static void main(String args[]){
	
		int arr[] = new int[]{2,6,3,7,4,8,5,9};

		int start = 0;
		int end = arr.length-1;

		MergeSort obj = new MergeSort();
		obj.mergeSort(arr,start,end);

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
}
