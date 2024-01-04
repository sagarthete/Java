// to print the product of digits of given numbers

import java.util.*;
 class Recursion{
 
 
 	static int prodDigit(int num){
	
		if(num<=0){
			return 1;
		}

		return (num%10) * prodDigit(num/10);
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int prod = prodDigit(num);

		System.out.println("prod is : "+prod);
	}
 }
