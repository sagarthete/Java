//mergeSort have mainly two phases 
//1. first is of deviding array upto it distributes into single elemented arrays
//2. second is to merge that saperate arrays in sorted manner

 class MergeSort{
 	
	void mergeSort(int arr[],int start,int end){
		
		if(start<end){
		
			int mid = (start+end)/2;
			System.out.println("start : "+start + " mid : "+mid+" end : "+end);
			
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
		}
		
	}

 	public static void main(String args[]){
	
		int arr[] = new int[]{9,1,8,2,7,3,6,4};

		int start = 0;
		int end = arr.length-1;
	
		MergeSort obj = new MergeSort();

		obj.mergeSort(arr,start,end);
	}
 }
