// general passing

    class ArrayDemo{
    
          static void fun(int arr[]){
	  
	        for(int x : arr){
		
		   System.out.println(x);
		}
		
	  }

	  public static void main(String args[]){
	  
	         int arr [] = {10,20,30};

		 fun(arr);  // passing arr as arguement(adress is sent);
	  }
    }
