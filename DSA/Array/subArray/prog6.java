// maximum subarray sum using kadane's algorithm

 class ArrayDemo{
 
 	public static void main(String args[]){
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};

		int max = Integer.MIN_VALUE;
		int sum = 0;
		int start = 0;
		int end = 0;

		for(int i=0;i<arr.length;i++){
			
			if(sum==0){
				start = i;
			}
			sum = sum + arr[i];
			if(sum>max){
				max = sum;
				end = i;
			}	
			if(sum<0){
				sum = 0;
			}
		}
		for(int i=start;i<=end;i++){
			System.out.println(arr[i]);
		}
		System.out.println(max);
	}
 }
