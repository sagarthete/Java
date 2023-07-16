// IndexxOutOfBound

 class Demo{
 
 	void fun(int arr[]){
	
	     System.out.println(arr[1]);
	}

	public static void main(String args[]){
	
		int arr[] = {11,2,3,4,5,6,7};

		Demo obj = new Demo();
		obj.fun(arr);
	}
 }
