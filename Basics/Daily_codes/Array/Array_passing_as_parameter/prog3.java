//checking the internals using identityHashCode

    class ArrayDemo{
    
          static void fun(int arr[]){
	  
	         for(int i : arr)
		   System.out.println(i);
		 
                 System.out.println("adress is= "+arr);
		 System.out.println("adress of ele in fun= "+System.identityHashCode(arr[0])); 
	  }

	  public static void main(String args[]){
	  
	         int arr[] = {10,20,30};
 
		 fun(arr);
		 System.out.println("in main");
		 
                 System.out.println("adress is= "+arr); 
		 System.out.println("adress of ele in fun= "+System.identityHashCode(arr[0])); 

                 
	  }
    }