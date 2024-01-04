// sum of one to n numbers without using extra variable

class Recursion {
	
	int sumNum(int num){
	
		if(num==0)
			return 0;

		return num+sumNum(--num);
	}

	public static void main(String args[]){
	
		Recursion obj = new Recursion();
		int ret = obj.sumNum(10);
		System.out.println(ret);
	}
}
