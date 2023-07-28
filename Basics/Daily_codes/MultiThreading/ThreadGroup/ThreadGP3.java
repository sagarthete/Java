class MyThread implements Runnable{

	public void run(){
	
		System.out.println(Thread.currentThread());

		try{
		
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			
			ie.toString();
		}
	}
}
 class ThreadDemo{
 
 
 	public static void main(String args[]){
	
		ThreadGroup tg1 = new ThreadGroup("India");

		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread t1 = new Thread(tg1,obj1,"Bhai1");
		Thread t2 = new Thread(tg1,obj2,"Bhai2");

		t1.start();
		t2.start();
	}
 }
