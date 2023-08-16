
interface Demo{

	int x = 200;

	default void fun(){
		System.out.println(x);
	}
}

 class DemoChild implements Demo{
 
 	void gun(){
	
		System.out.println("in gun");

	}
	void run(){
	
		System.out.println(x);
	}
 }

 class Child {
 
 	public static void main(String args[]){
																	DemoChild obj = new DemoChild();

		obj.fun();
		obj.run();
		obj.gun();
	}
 }

