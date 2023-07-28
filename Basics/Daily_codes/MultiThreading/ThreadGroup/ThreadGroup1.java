
 class MyThread extends Thread{
 
	 MyThread(ThreadGroup obj1,String s1){
	 
	 	super(obj1,s1);
	 }
 	 public void run(){
	
		System.out.println(Thread.currentThread());
	 }
 
 }

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		ThreadGroup tg = new ThreadGroup("TG1");
		MyThread obj = new MyThread(tg,"t1");
		obj.start();	
	}
 }
