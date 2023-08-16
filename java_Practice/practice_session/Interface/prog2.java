
 interface Demo{
 
 	default void fun(){
	
		System.out.println("in fun Demo");
	};
	static void gun(){
	
		System.out.println("in gun");
	}
 }
 interface Demo1{
 
 	default void fun(){
	
		System.out.println("in fun Demo1");
	}
 }
 class DemoChild implements Demo,Demo1{

	public void fun(){
	
		System.out.println("in fun");
	} 
 
	void run(){
	
		System.out.println("in run");
	}
 }

 class Clinet{
 
 	public static void main(String args[]){
	
		DemoChild obj = new DemoChild();
		obj.fun();
		Demo.gun();
		obj.run();
	}
 }
