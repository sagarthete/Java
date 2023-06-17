// normal innerr classs implemetation

 class Outer{
 
 	class Inner{
	
		Inner(){
		
			System.out.println("in Inner constructor");
		}

		void m1(){
		
			System.out.println("in m1-inner");
		}
	}

	void m1(){
	
		System.out.println("in m1-outer");
	}

	public static void main(String args[]){
	
		Inner obj = new Outer().new Inner();
		obj.m1();

	}
 }
