// print the length of digits 

import java.util.*;
class Recursion{
	int count = 0;
	int numPrint(int num){
	
		if(num==0){
			return 0;
		}
		count++;
		numPrint(num/10);
		return count;

	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int range = sc.nextInt();

		Recursion obj = new Recursion();
		int len =  obj.numPrint(range);
		System.out.println("the length  is: "+len);
	}
}
