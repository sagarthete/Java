//checking the internals using identityHashCode

    class ArrayDemo{
    
          static void fun(int arr[]){
	  
		for(int i = 0;i<arr.length;i++){
		  
		    arr[i] = arr[i] + 50; 
		}
		System.out.println("in fun");
		 System.out.println("Add of arr[0]= "+System.identityHashCode(arr[0]));
                 System.out.println("Add of arr[1]= "+System.identityHashCode(arr[1]));
                 System.out.println("Add of arr[2]= "+System.identityHashCode(arr[2]));
                System.out.println(arr);
	  }

	  public static void main(String args[]){
	  
	         int arr[] = {50,100,150};

                 System.out.println("Add of arr[0]= "+System.identityHashCode(arr[0]));
                 System.out.println("Add of arr[1]= "+System.identityHashCode(arr[1]));
                 System.out.println("Add of arr[2]= "+System.identityHashCode(arr[2]));

		 fun(arr);
		 System.out.println("after fun call in main");
                 
		 System.out.println("Add of arr[0]= "+System.identityHashCode(arr[0]));
                 System.out.println("Add of arr[1]= "+System.identityHashCode(arr[1]));
                 System.out.println("Add of arr[2]= "+System.identityHashCode(arr[2]));
                 System.out.println(arr);
		 

                 
	  }
    }
