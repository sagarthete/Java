//there can be scenario where we want to break the inheritance at certain point (at specific child);
//in these scenario the final keyword can be used
// final means no one can make changes in it, only accessing is possible

class Parent{

 	void marry(){
	
		System.out.println("marry with kareena");
	}

	void property(){
	
		System.out.println("flat,gold,balance");
	}
}

class Child1 extends Parent{

	void marry(){
	
		System.out.println("marry with deepika");
	}

	final void property(){
	
		System.out.println("fully empty");
	}

}

class Child2 extends Child1{

	void marry(){
	
		System.out.println("marry with alia");
	}
	/*void property(){
		
 		Ayatem.out.println("gold");    // error :method is final ,cannot be override	
	}*/                                         
} 

class Client{

 	public static void main(String args[]){
	
		Parent obj = new Child2();
		obj.marry();
		obj.property();

	}
   
}
