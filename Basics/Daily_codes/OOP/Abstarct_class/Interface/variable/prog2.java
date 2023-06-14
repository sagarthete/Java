// x will be newly instantiated at every refrence occured of x in program
//check bytecode for proof 
interface Demo{

	int x = 10;
}

class DemoChild implements Demo{

	void fun(){
	
		System.out.println(x);
		System.out.println(System.identityHashCode(x));
		System.out.println(x);
		System.out.println(System.identityHashCode(x));
	}
}

 class Client {
 
 	public static void main(String args[]){
	
		DemoChild obj = new DemoChild();
		obj.fun();
	}
 }
