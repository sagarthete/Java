//checking the internals using identityHashCode

    class ArrayDemo{
    
          static void fun(int arr[]){
	  
	         for(int i : arr)
		   System.out.println(i);
		 
                 System.out.println("adress is= "+arr);
		 System.out.println("adress of ele in fun= "+System.identityHashCode(arr[0])); 
		 arr[0]=arr[0]+10;
		 System.out.println("adress of ele in fun= "+System.identityHashCode(arr[0])); //adress of index 1 and 2 will same no                                                                                                 w arr[0] pointing same adress in whi                                                                                                 ch 20 is kept 
		 System.out.println("adress of 2nd ele in fun= "+System.identityHashCode(arr[1])); 

	  }

	  public static void main(String args[]){
	  
	         int arr[] = {10,20,30};
 
		 fun(arr);
		 System.out.println("in main");
		 
                 System.out.println("adress is= "+arr); 
		 System.out.println("adress of ele in fun= "+System.identityHashCode(arr[0])); 

                 
	  }
    }
