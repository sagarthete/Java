
 class MyThread extends Thread{
 
	 MyThread (ThreadGroup obj,String str){
	 
	 	super(obj,str);
	 }
	public void run(){
	
		System.out.println("int run method");

		try{
		
			Thread.sleep(5000);
		}catch(InterruptedException ie){
			
			ie.toString();
		}
	}
 }

 class ThreadDemo{
 
 	public static void main(String args[]){
	
	 	ThreadGroup tg1 = new ThreadGroup("Defence");

		MyThread obj1 = new MyThread(tg1,"Army");
		MyThread obj2 = new MyThread(tg1,"Navy");

		obj1.start();
		obj2.start();

		ThreadGroup tg2 = new ThreadGroup(tg1,"Army");
		 
		MyThread obj3 = new MyThread(tg2,"Tanks");
		MyThread obj4 = new MyThread(tg2,"Mescile");

		obj3.start();
		obj4.start();
		 
		obj3.start();
		obj4.start();
			
		//tg2.interrupt();   //illigalThreadStateException

		System.out.println("\n\nend main");
	}
 
 }
