class ArrayDemo{

      public static void main(String args[]){
      
             String str1 = "Sagar";
	     String str2 = "Thete";

	     System.out.println(str1+str2);

	     String str3 = "SagarThete";
	     String str4 = str1+str2;

	     System.out.println(System.identityHashCode(str3));
	     System.out.println(System.identityHashCode(str4));

      
      }
  
}
