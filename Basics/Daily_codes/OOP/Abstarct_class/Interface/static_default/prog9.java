
interface Demo1{

  	static void fun(){
	
		System.out.println("in fun");
	}
}
interface Demo2 extends Demo1{

        void gun();
}

class DemoChild implements Demo2,Demo1{

 	public void gun(){
	
		System.out.println("in gun");
	}

	public static void main(String args[]){
	
	 	DemoChild obj = new DemoChild();
		obj.fun();
		obj.gun();
	}
}
