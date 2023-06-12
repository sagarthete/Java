//static method cannot be overriden ,in overriing only access is provided of static method 

class Parent {

	static void fun(){
	
		System.out.println("in Parent fun");
	}
}

class Child extends Parent{

   	void fun(){
	
		System.out.println("in Child fun");
	}
}

class Client{

	public static void main(String args[]){
	
	    	Parent obj1 = new Child();
		obj1.fun();
 	}
}
