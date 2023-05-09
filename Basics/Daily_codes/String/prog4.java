
     class StringDemo{
     
           public static void main(String args[]){
	   
	          String str1 = "sagar";

		  String str2 = new String ("sagar");

		  System.out.println(System.identityHashCode("str1 "+str1));
		  System.out.println(System.identityHashCode("str2 "+str2));

		  String str3 = "sagar";
		  String str4 = new String("sagar");
		  
		  System.out.println(System.identityHashCode("str3 "+str3));
		  System.out.println(System.identityHashCode("str4 "+str4));

	    }
          
     }
