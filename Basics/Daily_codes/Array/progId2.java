// to open the ByteCode

     class ArrayDemo{
     
           public static void main(String args[]){
	   
	          int arr1 [] = {150,200,300};
		  Integer arr2 [] = {400,500};

		  System.out.println(arr1);
		  System.out.println(arr2);
		  
		  System.out.println(arr1[0]);
		  System.out.println(arr2[0]);


		  System.out.println("arr1:- "+System.identityHashCode(arr1[0]));
		  System.out.println("arr1:- "+System.identityHashCode(arr1[1]));
		  
		  System.out.println("arr2:- "+System.identityHashCode(arr2[0]));
		  System.out.println("arr2:- "+System.identityHashCode(arr2[1]));

		  System.out.println("\ndouble printing\n");
		  System.out.println("arr1:- "+System.identityHashCode(arr1[0]));
		  System.out.println("arr1:- "+System.identityHashCode(arr1[1]));
		  
		  System.out.println("arr2:- "+System.identityHashCode(arr2[0]));
		  System.out.println("arr2:- "+System.identityHashCode(arr2[1]));

		      
		    
		  
	   
	   }
       
     }
