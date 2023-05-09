
   class ArrayDemo{
   
         public static void main(String args[]){
	 
	         String str1 = "Sagar";
		 String str2 = "Thete";

		 String str3 = "Sagar";
		 String str4 = str3 + "Thete";
		 String str5 = "SagarThete";

		 System.out.println("str4 :- "+str4);

		 System.out.println(System.identityHashCode(str4));
		 System.out.println(System.identityHashCode(str5));
	 }
   
   }
