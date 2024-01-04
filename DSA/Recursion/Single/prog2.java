// sum of one to n numbers

class Recursion {
	
	int sum = 0;
	int sumNum(int num){
	
		if(num==0)
			return 0;

		sum = sum + num;
		sumNum(--num);

		return sum;
	}

	public static void main(String args[]){
	
		Recursion obj = new Recursion();
		int ret = obj.sumNum(10);
		System.out.println(ret);
	}
}
