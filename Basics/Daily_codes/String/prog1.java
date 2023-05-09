 
    class StringDemo{
     
          public static void main(String args[]){
	  
	         String str1 = "Core2Web";
             
		 String str2 = new String("core2Web");

		 System.out.println(str1);
		 System.out.println(System.identityHashCode(str1));
		 System.out.println(str1);
		 
		 System.out.println(str2);
		 System.out.println(System.identityHashCode(str2));
		 System.out.println(str1);

		 	        


	  }   
    
    }
