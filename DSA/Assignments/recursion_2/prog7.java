import java.util.*;
class Recursion{
	
	static int num = 0;
	static int perfect(int i){
	
		if(i==num)
			return 0;
		int rem = 0;
		if(num%i==0)
			rem = i;
		return rem + perfect(++i);
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		num = sc.nextInt();
		
		int ret = perfect(1);

		if(ret == num)
			System.out.println("number is perfect number");
		else
			System.out.println("number is not a perfect number");

	}	
}
