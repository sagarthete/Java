// print the count of possible subarrays

class ArrayDemo{

	public static void main(String args[]){
	
			int count = 0;
		int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		for(int i = 0;i<arr.length;i++){
		
			for(int j=i;j<arr.length;j++){
			
				for(int k=i;k<=j;k++){
					System.out.print(arr[k]+" ");
				}
				count++;
				System.out.println();
			}
		}
		System.out.println(count);
	}
}
