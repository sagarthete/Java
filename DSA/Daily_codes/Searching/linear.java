class Search{

	int search(int arr[],int ele){
	
		for(int i = 0;i<arr.length-1;i++){
		
			if(arr[i]==ele){
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]){
	
		int arr[] = new int[]{11,34,21,56,25,64,78};
		Search obj = new Search();
		int ret = obj.search(arr,34);
		
		if(ret==-1)
			System.out.println("element is not present");
		else
			System.out.println("element found at index : "+ret);

	}
}

