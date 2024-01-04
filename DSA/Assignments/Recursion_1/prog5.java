//to check the number is prime or not
import java.util.*;
class Recursion{
	int fnum = 0;
	int flag = 0;
	int count = 0;

	void assign(int num){
	
		fnum = num;
		flag = 1;
	}

	int primeCheck(int num){
	
		if(flag == 0){
			assign(num);
		}
		if(num==1){
			return 0;
		}
		primeCheck(--num);
		if(fnum%num==0){
			count++;
		}
		return count;

	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();

		Recursion obj = new Recursion();
		int count =  obj.primeCheck(num);
		if(count<=1)
			System.out.println("this is prime number");
		else
			System.out.println("this is not prime number");
	}
}
