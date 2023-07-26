
 class Parent{
 
 	void fun(){
	
		System.out.println("in fun method");
	}
 }
 
 class Child extends Parent,implements Runnable{
 
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
	
		MyThread obj = new MyThread();
		obj.start();
	}
 }
