// when we override the method with the lower access and overriding method providing greater access then its allowed

class Parent{
 
	void fun(){                    //default:access specifier
	 
		System.out.println("in Parent fun");
	}
}

class Child extends Parent{

	public void fun(){             // public: access Specifier
	
	  	System.out.println("in Child Fun");
	}

}

class Client{

	public static void main(String args[]){
	
	  	Parent obj = new Child();
		obj.fun();             
	}

}
