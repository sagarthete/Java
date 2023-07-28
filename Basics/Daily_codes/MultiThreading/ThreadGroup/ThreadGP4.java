
 class MyThread implements Runnable{
 
 	public void run(){
	
		System.out.println("in run method");
		try{
		
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){}
		System.out.println(Thread.currentThread());
	}
 }

 class ThreadDemo{
 
 	public static void main(String args[])throws InterruptedException{
	
		ThreadGroup tg1 = new ThreadGroup("college");
		
		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread t1 = new Thread(tg1,obj1,"compDepart");
	        Thread t2 = new Thread(tg1,obj2,"ITDepart");
		
		t1.start();
		t2.start();

		System.out.println(tg1.activeCount());
		System.out.println(tg1.activeGroupCount());

		ThreadGroup tg2 = new ThreadGroup(tg1,"computerDepart");

		MyThread obj3 = new MyThread();
		MyThread obj4 = new MyThread();

		Thread t3 = new Thread(tg2,obj3,"Div A");
		Thread t4 = new Thread(tg2,obj4,"Div B");

		t3.start();
		t4.start();

		
		System.out.println(tg1.activeCount());
		System.out.println(tg1.activeGroupCount());

		System.out.println("parent of computerDepart is : "+ tg2.getParent());

	}
  
 }
