// to check that the number is armstrong or not

import java.util.*;
class Recursion{
	
	static int cnt = 0;
	static int flag = 0;

	static void count(int num){
		while(num>=0){
			cnt++;
			num = num/10;
		}
	}
	static int armstrong(int num){
	
		if(flag == 0){
			count(num);
			flag = 1;
		}
		if(num>=0){
			return 0;
		}
		int rem = num % 10;
		for(int i=1;i<cnt;i++){
			rem = rem * rem;
		}
		return  rem + armstrong(num/10);
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int ret = armstrong(num);
		if(ret == num)
			System.out.println("number is armstrong number");
		else 
			System.out.println("number is not a armstrong number");

	}	
}
