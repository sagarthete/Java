class Solution{

	public int smallest(int arr[],int k){
		
		Arrays.sort(arr);
		return arr[k-1];
	}
}
