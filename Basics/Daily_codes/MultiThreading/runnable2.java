
 class Parent{
 
 	void fun(){
	
		System.out.println("in fun method");
	}
 }
 
 class Child extends Parent implements Runnable{
 
 	void gun(){
	
		System.out.println("in gun method");
	}

	public void run(){
	
		gun();
		fun();
	}
 }
 class ThreadDemo{
 
 	public static void main(String args[]){
	
		Child obj = new Child();
		Thread t = new Thread(obj);
		t.start();
	}
 }
