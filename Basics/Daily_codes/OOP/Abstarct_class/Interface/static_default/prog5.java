// ambigious scenario of the mn=multiple inhertitance
// in this scenario default method should be overriden(should be implemented in child class);

 interface Demo1{
 
 	default void fun(){
	
		System.out.println("in Demo1-fun");
	}
 }
 interface Demo2{
 
 	default void fun(){
	
		System.out.println("in Demo2-fun");
	}
 }

 class DemoChild implements Demo1,Demo2{
 
 	public void fun(){
	
		System.out.println("in Demochild fun");
	}
 }
 
 class Client{
 
 	public static void main(String args[]){
	
	 	DemoChild obj = new DemoChild();
 		obj.fun();
	}
 }
