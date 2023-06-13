
// multiple inheritance ambiguity scenario
// when we have two interfaces with same method , and implemented both interfaces in one class then,
// there is no abiguity oin interface because both method have no body ,any one can be implemented in child class

interface Demo1{

        void fun();
}
interface Demo2{

	void fun();
}
class DemoChild implements Demo1,Demo2{

    	public void fun(){
	
	 	System.out.println("in DemoChild fun");
	}
}

class Client{

 	public static void main(String args[]){
	
		Demo1 obj = new DemoChild();
		obj.fun();
	}  
}
