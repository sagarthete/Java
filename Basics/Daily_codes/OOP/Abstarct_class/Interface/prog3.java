interface Demo{

   	void fun();
	void gun();

}

abstract class DemoC1 implements Demo{

	public void fun(){             // must be written as public 
	
	   	System.out.println("in Fun implemented");
	}
}
class DemoC2 extends DemoC1{

	public void gun(){

		System.out.println("in gun implemented");
	}
}

class Client {

	public static void main(String args[]){
	
		Demo obj = new DemoC2();     // interface will never instantiated
		obj.fun();
		obj.gun();
	}
}
