//print the factorial of number 

import java.util.*;
class Recursion{
	
	int fact = 1;

	int numPrint(int num){
	
		if(num==1){
			return 0;
		}
		fact = fact * num;
		numPrint(--num);
		return fact ;

	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the range");
		int range = sc.nextInt();

		Recursion obj = new Recursion();
		int fact =  obj.numPrint(range);
		System.out.println("the factorial is: "+fact);
	}
}
