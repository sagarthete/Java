
   class StringDemo{
    
         public static void main(String args[]){
	 
	        String str1 = "sagar";
	        String str2 = "thete";
	   
      	        String str3 = new String("sagarthete");
                String str4 = str1.concat(str2);

	        System.out.println(str1);	
	        System.out.println(str2);
	        System.out.println(str3);

	        System.out.println(System.identityHashCode(str1));
	        System.out.println(System.identityHashCode(str2));
	        System.out.println(System.identityHashCode(str3));
	        
		System.out.println(System.identityHashCode(str4));
                

	 }
   }
