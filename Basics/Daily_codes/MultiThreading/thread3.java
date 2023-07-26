
 class MyThread extends Thread {
 
 	void fun(){
	
			System.out.println("in fun : "+Thread.currentThread().getName());
		
	}

	public void run(){
	
			System.out.println(Thread.currentThread().getName());
	}
 }

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		MyThread obj = new MyThread();
		obj.start();

		obj.fun();
	}
 }
