

interface Demo{

     static void fun(){
     
     	System.out.println("in Demo fun");
     }

}

class DemoChild implements Demo{

	void fun(){                     //this method is saperate method of DemoChild
	
	  	System.out.println("in fun DemoChild");
		Demo.fun();
	}
}

class Client {

	public static void main(String args[]){
	 
		DemoChild obj = new DemoChild();
		obj.fun();
		Demo.fun();
	}
}
