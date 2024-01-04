// to check the  number is strong number or not
import java.util.*;
class Recursion{

	static int calFact(int num){
		if(num<=0)
			return 1;
		return num * calFact(--num);
	}	

	static int strong(int num){
		if(num<=0)
			return 0;
		int rem = num%10;
		int fact = calFact(rem);
		return fact + strong(num/10); 
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int ret = strong(num);
		if(ret == num){
			System.out.println("number is strong number");
		}
		else{
			System.out.println("number is not strong number");
		}
	}	
}
