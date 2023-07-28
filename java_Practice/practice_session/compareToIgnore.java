
class Demo{

	public static void main(String args[]){
	
		String str1 = "sagar";
		String str2 = "Sagar";
		String str3 = "thete";

		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str2.compareToIgnoreCase(str2));
		System.out.println(str2.compareToIgnoreCase(str3));
		System.out.println(str3.compareToIgnoreCase(str2));
		System.out.println(str2.compareToIgnoreCase("SAGAR"));
	}
}
