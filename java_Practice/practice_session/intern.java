
 class Demo{
 
 	public static void main(String args[]){
	
		String str1 = "sagar";

		String str2 = new String("sagar").intern();

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

	}
 }
