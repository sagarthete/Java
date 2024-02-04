class Solution{

	public int largest(int arr[],int k){
	
		Arrays.sort(arr);
		return arr[arr.length-k];
	}
}
