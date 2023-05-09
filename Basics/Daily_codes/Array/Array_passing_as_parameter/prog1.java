// printing value in main

  class ArrayDemo{
  
  
       static void fun(int arr[]){
            
	      for(int x:arr){
	      
	         System.out.println(x);
	      }
	    arr[1] = 721;

       }
        public static void main(String args[]){
	
	       int arr[] = {10,20,30};
	       fun(arr);
  
	       System.out.println("in main");
	       for(int i:arr){
	          System.out.println(i);
	       }
	}
  }
