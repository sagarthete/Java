// to check that the given number is palindrome or not
import java.util.*;
class Recursion{

	static int palindrome(int num,int rev){
		
		if(num<=0)
			return rev;
		int rem = num%10;
		rev = rev*10+rem;
		rev = palindrome(num/10,rev);
		return rev;		

	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();

		int ret = palindrome(num,0);
		if(ret==num)
			System.out.println("number is palindrome");
		else
			System.out.println("number is not palindrome");
	}
}
