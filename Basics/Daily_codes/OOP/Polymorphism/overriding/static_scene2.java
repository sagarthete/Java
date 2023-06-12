//static method cannot be overriden ,in overriing only access is provided of static method 
//if static method is present in both parent and child then both are considered as saperate methods 
//static method will bind with the reference at compile time 
class Parent {

	static void fun(){
	
		System.out.println("in Parent fun");
	}
}

class Child extends Parent{

   	static void fun(){
	
		System.out.println("in Child fun");
	}
}

class Client{

	public static void main(String args[]){
	
	    	Parent obj1 = new Parent();
		obj1.fun();
		
	    	Child obj2 = new Child();
		obj2.fun();
	    	
		Parent obj3 = new Child();
     		obj3.fun();
 	}
}
