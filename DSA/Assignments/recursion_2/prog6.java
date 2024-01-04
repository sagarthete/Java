// to calculate the number is magic number or  not
import java.util.*;
class Recursion{
	
	static int magic(int num){
	
		if(num<=0)
			return 0;
		int rem = num%10;
		return rem + magic(num/10);
	}

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int ret1 = magic(num);
		int ret2 = magic(ret1);
		if(ret2 == 1){
			System.out.println("number is magic number");
		}
		else{
			System.out.println("number is not magic number");
		
		}
	}	
}
