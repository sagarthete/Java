// print the sum of n natural numbers 

import java.util.*;
class Recursion{
	
	int sum = 0;

	int numPrint(int num){
	
		if(num==0){
			return 0;
		}
		sum = sum + num;
		numPrint(--num);
		return sum ;

	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		int range = sc.nextInt();

		Recursion obj = new Recursion();
		int sum =  obj.numPrint(range);
		System.out.println("the sum  is: "+sum);
	}
}
