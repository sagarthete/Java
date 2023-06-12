// when we override the method with the greater access and overriding method providing lower access then it not allowed

class Parent{
 
	public void fun(){                    //public:access specifier
	 
		System.out.println("in Parent fun");
	}
}

class Child extends Parent{

	void fun(){             // default: access Specifier
	
	  	System.out.println("in Child Fun");
	}

}

class Client{

	public static void main(String args[]){
	
	  	Parent obj = new Child();
		obj.fun();             
	}

}
