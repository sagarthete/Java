// print the sum of n natural numbers 

import java.util.*;
class Recursion{
	
	int numPrint(int num){
	
		if(num==0){
			return 0;
		}
		return num + numPrint(--num);
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
