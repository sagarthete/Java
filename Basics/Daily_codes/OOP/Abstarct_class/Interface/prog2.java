// all methods of interface must be implemented in child class otherwise declare it as abstract
interface Demo{

   	void fun();
	void gun();

}

class DemoC1 implements Demo{

	public void fun(){             // must be written as public 
	
	   	System.out.println("in Fun implemented");
	}
}

class Client {

	public static void main(String args[]){
	
		Demo obj = new DemoC1();     // interface will never instantiated
		obj.fun();
		obj.gun();
	}
}
