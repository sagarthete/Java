//count the appearance of spesific digit in given number 

import java.util.*;
class Recursion{
	
	int count = 0;

	int appearance(int num,int digit){
	
		if(num==0){
			return 0;
		}
		int rem = num % 10;
		if(rem==digit){
			count++;
		}
		appearance(num/10,digit);
		return count;

	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		System.out.println("enter the digit");
		int digit = sc.nextInt();


		Recursion obj = new Recursion();
		int count =  obj.appearance(number,digit);
		System.out.println("the count is: "+count);
	}
}
