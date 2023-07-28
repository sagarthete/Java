
 class MyThread extends Thread{
 
   	MyThread(ThreadGroup tg, String str1){
	
		super(tg,str1);
	}	
	
	public void run(){
	
		System.out.println(Thread.currentThread());

		try{
		
			Thread.sleep(8000);

		}
		catch(InterruptedException ie){
			
			ie.toString();
		}
	}
 }

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		ThreadGroup tg1 = new ThreadGroup("India");

		MyThread obj1 = new MyThread(tg1,"maha");
		MyThread obj2 = new MyThread(tg1,"goa");

		obj1.start();
		obj2.start();

               	ThreadGroup tg2 = new ThreadGroup(tg1,"pakistan");

		MyThread obj3 = new MyThread(tg2,"karachi");
		MyThread obj4 = new MyThread(tg2,"lahore");

		obj3.start();
		obj4.start();

		System.out.println(tg1.activeCount());
		System.out.println(tg1.activeGroupCount());

	}
 
 }
