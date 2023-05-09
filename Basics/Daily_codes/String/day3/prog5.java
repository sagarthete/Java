//   == operator will check identityHashCode of object

    class StringDemo{
    
          public static void main(String args[]){
	  
	         String str1 = "Sagar";
		 String str2 = "Sagar";

		 String str3 = new String("Sagar");
                 String str4 = str3;
		 
		 if(str3==str4){
		 
		   System.out.println("equal string");
		 }

		 if(str1==str2){
		 
		    System.out.println("equal");
		 }

		 if(str1 == str3){
		    System.out.println("equal");
		 }
		 else{
		    System.out.println("not equal"); 
		 }
	   
	  }
    }
