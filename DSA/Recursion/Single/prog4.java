//sum of digits of numbers

 class Recursion{
 	
	int sum = 0;
 	int sumDigit(int num){
	
		if(num<=0)
			return 0;

		int rem = num%10;
		sum = sum + rem;
		sumDigit(num/10);
		return sum;
	}
	public static void main(String args[]){
	
		Recursion obj = new Recursion();
		int ret = obj.sumDigit(123);
		System.out.println(ret);
	}
 }
