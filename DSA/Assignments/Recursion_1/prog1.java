// print the numbers between 1 to 10

class Recursion{

	void numPrint(int num){
	
		if(num==1){
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
