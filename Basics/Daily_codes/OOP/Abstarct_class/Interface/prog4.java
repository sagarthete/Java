// multiple inheritance

interface Demo1{

   	void fun();
	
}

interface Demo2{
 
        void gun();
}

class DemoC1 implements Demo1,Demo2{

	public void fun(){
	
		System.out.println("in fun method");
	} 
	public void gun(){
	
		System.out.println("in gun method");
	}
}
class Client {

	public static void main(String args[]){
	
		Demo1 obj1 = new DemoC1();     // interface Demo1 must be given as reference 
		Demo2 obj2 = new DemoC1();     // interface Demo2 must be givern as reference
		obj1.fun();
		obj2.gun();
	}
}
