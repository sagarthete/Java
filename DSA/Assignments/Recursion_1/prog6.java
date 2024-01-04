// print the sum of digits of number

import java.util.*;
class Recursion{
	int count = 0;
	int digitSum(int num){
	
		if(num==0){
			return 0;
		}
		int rem = num%10;
		return rem + digitSum(num/10);
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int range = sc.nextInt();

		Recursion obj = new Recursion();
		int sum =  obj.digitSum(range);
		System.out.println("the sum  is: "+sum);
	}
}
