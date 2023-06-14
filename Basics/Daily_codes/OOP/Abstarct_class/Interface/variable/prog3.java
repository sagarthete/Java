
class Demo{

	void fun(){
	  
		int x = 10;
  		System.out.println(System.identityHashCode(x));
	 }

	void gun(){
	
		int x = 10;
  		System.out.println(System.identityHashCode(x));
	
	}

	public static void main(String args[]){
	
	 	Demo obj = new Demo();
		obj.fun();
		System.out.println("in main");
		System.out.println("in main");
		System.out.println("in main");
		System.out.println("in main");
		System.out.println("in main");
		System.out.println("in main");
		obj.gun();

	}
}
