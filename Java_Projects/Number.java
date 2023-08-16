

package Number;
import java.util.*;

public class Number  {
	
	public void perfectNum() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		for(int i=1; i<=num/2; i++){
			
			if(num%i == 0)
				sum = sum+i;
		}
		if(temp == sum)
			System.out.println(temp+" = "+ " is Perfect Number");
		else
			System.out.println(temp+" = "+ " is Not Perfect Number");
	}
		

	public void armStrongNum() {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		num = sc.nextInt();
		int count = 0;
		int temp = num;

		while(num != 0){
			count++;
			num = num/10;		
		}
		num = temp;
		int sum =0;
		while(temp != 0){
			int result = 1;		
			int rem = temp%10;
			for(int i=1; i<=count; i++){
			
				result = rem*result;	
			}
			sum = sum+result;

			temp = temp/10;
		}
		if(sum == num){
			System.out.println(num+" = "+ " is Armstrong Number");
		}else{
			System.out.println(num+" = "+ " is Not Armstrong Number");
		}	
	}
}
