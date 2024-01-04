// print the first 10  natural numbers

class Recursion{

	void numPrint(int num){
	
		if(num==0){
			return;
		}
		numPrint(--num);
		System.out.println(num);

	}

	public static void main(String args[]){
	
		Recursion obj = new Recursion();
		obj.numPrint(10);
	}
}
