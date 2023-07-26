
 class MyThread implements Runnable{
 
 	public void run(){
	
		System.out.println("in run-runnable");
	}
 }

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		MyThread obj = new MyThread();
		Thread t = new Thread(obj);
		t.start();
	}
 
 }
