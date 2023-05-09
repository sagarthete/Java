
     class StringDemo{
     
           public static void main(String args[]){
	   
	          String str1 = "sagar";

		  String str2 = new String ("sagar");
                  int arr[] = {200,300};
		   
		  System.out.println(System.identityHashCode(str1));
		  System.out.println(System.identityHashCode(str2));

		  String str3 = "sagar";
		  String str4 = new String("sagar");
		  
		  System.out.println(System.identityHashCode(str3));
		  System.out.println(System.identityHashCode(str4));
		  
		  System.out.println(System.identityHashCode(str3));
		  System.out.println(System.identityHashCode(str4));

		  System.out.println("of array");
		  System.out.println(System.identityHashCode(arr[0]));
		  System.out.println(System.identityHashCode(arr[1]));
		  
		  System.out.println(System.identityHashCode(arr[0]));
		  System.out.println(System.identityHashCode(arr[1]));


	    }
          
     }
