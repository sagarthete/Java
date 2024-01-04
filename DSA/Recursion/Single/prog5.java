//sum of digits of numbers wihout using third variable

 class Recursion{
 	
 	int sumDigit(int num){
	
		if(num<=0)
			return 0;

		return num%10 + sumDigit(num/10);
	}
	public static void main(String args[]){
	
		Recursion obj = new Recursion();
		int ret = obj.sumDigit(123);
		System.out.println(ret);
	}
 }
