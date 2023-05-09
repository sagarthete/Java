
     class ArrayDemo{
     
           public static void main(String args[]){
	   
	          String str1 = "kanha";
		  String str2 = "kanha";

		  String str3 = new String ("kanha");
		  String str4 = new String ("kanha");
		  String str5 = new String ("rahul");

		  String str6 = "rahul";

		  System.out.println("str1:- "+System.identityHashCode(str1));
		  System.out.println("str2:- "+System.identityHashCode(str2));
		  System.out.println("str3:- "+System.identityHashCode(str3));
		  System.out.println("str4:- "+System.identityHashCode(str4));
		  System.out.println("str5:- "+System.identityHashCode(str5));
		  System.out.println("str6:- "+System.identityHashCode(str6));
	   }
     
     }
