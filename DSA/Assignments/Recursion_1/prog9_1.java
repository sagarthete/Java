// to print the reverse of the string

 import java.util.*;
 class Recursion{
 
 	String revString(int num,char ch,int arr[]){
	
		if(num==arr.length-1)
			return ch;

		String str = revString(++num,arr[num],arr);

		return str+ch;
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char arr[] = str.toCharArray();

		Recursion obj = new Recursion();
		String revStr = obj.revString(0,arr[0],arr);
		System.out.println(revStr);
	}
 }
