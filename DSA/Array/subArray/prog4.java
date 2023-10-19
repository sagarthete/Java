//find the largest subarray sum using prefix sum approach


class ArrayDemo{

	public static void main(String args[]){
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int ps[] = new int[arr.length];
		ps[0] = arr[0];

		for(int i=0;i<arr.length;i++){
		
			ps[i] = ps[i-1] + arr[i];
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			
			for(int)
		}
	}
}
