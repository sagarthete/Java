// methods are internally public even if we apply static or default on it;
// static and default are not same as class (static is not modifier and default is not access specifier)
// static and default are only keywords in interface used for define the method in body of interface

 interface Demo{
  
    	default void fun(){       //==> in bytecode : public default void fun

		System.out.println("in Defaull fun");
	}

	static void gun(){
	
		System.out.println("in Static fun");
	}
 }
 class DemoChild implements Demo{
 
 	void fun(){                     // error : attempting to assign weaker access previleges:was public
	
	 	System.out.println("in Demochild fun");
	}
 }
