
    class ArrayDemo{
    
          public static void main(String args[]){
	  
	        short [][]arr = new short[3][];

		arr[0] = new short[]{1,2,3}; 
	        arr[1] = new short[]{4,5};
		arr[2] = new short[]{7,8,9};

		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
                System.out.println(arr[1][2]);

	  }
    
    }
