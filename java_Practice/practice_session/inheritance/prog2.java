 
 class Parent{
 
 	private Parent(){
	
		System.out.println("in parent");
	}
 }

 class Child extends Parent{
 	
	 Child(){
	 
	 	System.out.println("in child");
	 }
 }
 class Demo{
 
 	public static void main(String args[]){
	
		Child obj = new Child();
	}
 }
