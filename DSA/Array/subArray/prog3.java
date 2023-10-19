// print the subarray , which have largest sum of elements 


class ArrayDemo{

	public static void main(String args[]){
	
		int arr[] = new int[]{-2,1,-3,4,-1,2,-5,4};
		
		int start = 0;
		int end = 0;
		int sum1 = Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
				int sum2 = 0;
				for(int k = i;k<=j;k++){
					sum2 = sum2+arr[k];	
				}
				if(sum2>sum1){
					sum1 = sum2;
					start = i;
					end = j;
				}
				System.out.println(sum1);
				System.out.println(sum2);
			}
		}
		System.out.println("the array is........");
		for(int i=start;i<=end;i++){
			System.out.println(arr[i]);
		}
	}

}
