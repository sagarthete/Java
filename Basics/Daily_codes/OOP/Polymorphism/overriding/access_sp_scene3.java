
 class Parent{
 
      	void fun(){
	
	   	System.out.println("in Parent fun");
	}
 }

class Child extends Parent{
	
	private void fun(){
	
	  	System.out.println("in Child fun");
	}

}

class Client{

  	public static void main(String args[]){
	
		Parent obj = new Child();
		obj.fun();
	}
}
