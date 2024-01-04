// print the numbers from one to n using recursion

 class Recursion{
 	
 	void fun(int num){
		if(num==0)
			return;
		fun(--num);
		System.out.println(num);	
	}

	public static void main(String args[]){
	
		Recursion obj = new Recursion();
		obj.fun(10);
	}
 }

