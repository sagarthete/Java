
// default is used to give the body to the method in interface , and when we want to inherit and override that method   "default" must be given

 interface Demo{
 
    	default void fun(){
	
		System.out.println("in fun Default");
	}
 }
 class DemoChild implements Demo{
 
 	public void fun(){
	
		System.out.println("in DemoChild fun");
	}
 }
 
 class Client {
 
 	public static void main(String args[]){
	
	 	Demo obj = new DemoChild();
		obj.fun();
	}
 }
