
 interface Demo{
 
 	void fun();
	void gun();
 }

 class DemoChild implements Demo{
 
 
	public void fun(){
		System.out.println("in fun");
	}
	public void gun(){
	
	}
 }

 class Clinet{
 
 	public static void main(String args[]){
	
		Demo obj = new DemoChild();
		obj.fun();
		obj.gun();
	}
 }
