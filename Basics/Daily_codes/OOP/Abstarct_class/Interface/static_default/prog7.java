// we can never call static interface method sing object
// must be called by interface name

interface Demo{

	static void fun(){
	
		System.out.println("in Demo fun");
	}
}
 
 class DemoChild implements Demo{
 
 	
 }
 
 class Client{
 
  	public static void main(String args[]){
	
		Demo obj = new DemoChild();
		obj.fun();    // illigal static interface-method call
	}
 }
