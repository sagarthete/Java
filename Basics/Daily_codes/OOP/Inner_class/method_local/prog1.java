// implementation of method local inner class
// inner class must be instantiated in method body

 class Outer{
 
 	Outer(){
	
		System.out.println("in outer constructor");

	}
	
	void m1(){
	
		System.out.println("in m1 Outer");
			
		class Inner{
			
			Inner(){
			
				System.out.println("in Inner constructor");
			}	
		

		void m2(){
		
			System.out.println("in Inner m2");
			
		}
		
	     }

	     Inner obj = new Inner();
	     obj.m2();
	}
}

class Client{

	public static void main(String args[]){
	
		Outer obj = new Outer();
		obj.m1();
	}
}
