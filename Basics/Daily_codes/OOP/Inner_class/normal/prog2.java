
class Outer{

	Outer(){
	
		System.out.println("in Outer constructor");
	}

	class Inner{
	
		Inner(){
		
			System.out.println("in inner constructor");
		}
	}

	void m1(){
	
		System.out.println("in m1 method");
	}
}

class Client{

	public static void main(String args[]){
	
		Outer.Inner obj = new Outer().new Inner();
	}
	
}

