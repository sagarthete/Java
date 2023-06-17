// Inner class can be inherited by Child of Outer class
class Outer{

	Outer(){
	
		System.out.println("in Outer constructor");
	}

	class Inner{
	
		Inner(){
		
			System.out.println("in inner constructor");
		}
		void m2(){
			
			System.out.println("m2 Inner");
		
		}
	}

	void m1(){
	
		System.out.println("in m1 method");
	}
}

class OuterChild extends Outer{

	OuterChild(){
	
		System.out.println("in OuterChild constructor");
	}

	void m1(){
	
		System.out.println("in OuterChild m1");
	}
}

class Client{

	public static void main(String args[]){
	
		OuterChild.Inner obj = new OuterChild().new Inner();
		obj.m2();
	}
	
}

