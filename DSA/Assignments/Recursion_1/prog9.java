// print the numbers between 1 to 10

import java.util.*;
class Recursion{
	
	String revString(String str){
	
		if(str.length()==1)
			return str;

		char ch = str.charAt(0);

		return revString(str.substring(1))+ch;
	}


	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		Recursion obj = new Recursion();
		str = obj.revString(str);
		System.out.println("reverse String is: "+str);
	}
}
