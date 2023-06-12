// basic concept

interface Demo{

   	void fun();
	void gun();

}

class DemoC1 implements Demo{

	public void fun(){             // must be written as public 
	
	   	System.out.println("in Fun implemented");
	}
	public void gun(){
	
	  	System.out.println("in Gun implemented");
	}
}

class Client {

	public static void main(String args[]){
	
		Demo obj = new DemoC1();     // interface will never instantiated
		obj.fun();
		obj.gun();
	}
}
