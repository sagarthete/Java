
  interface Demo{
  
  	 void gun();
	 default void fun(){
	 
	  	System.out.println("in fun-Demo"); 
	 }
	
  }

 class DemoChild implements Demo{
 
 	public void gun(){
	
		System.out.println("in gun-Demochild");
	}
 }

 class Client {
 
 	public static void main(String args[]){
	
		Demo obj = new DemoChild();
		obj.fun();
		obj.gun();
	}
 }