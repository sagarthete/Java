
class Demo{

	public static void main(String args[]){
	
		String str1 = "sagar";
		String str2 = "sagar thete";
		String str3 = "thete";

		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		System.out.println(str3.compareTo(str2));
		System.out.println(str2.compareTo("sagar"));
	}

}
