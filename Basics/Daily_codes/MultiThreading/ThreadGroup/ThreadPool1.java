
class MyThread implements Runnable{

	int num;
	MyThread(int num){
		
		this.num = num;
	} 	
	public void run(){
	
		System.out.println(Thread.currentThread()+"start Thread : "+num);
		dailyTask();
		System.out.println(Thread.currentThread()+"end Thread : "+num);
	}

	void dailyTask(){
	
		try{
			Thread.sleep(8000);
		}
		catch(InterruptedException ie){}
	}	
}

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		ExecutorService ser = Executors.newFixedThreadPool();

		for(int i = 0;i<9;i++){
		
			MyThread obj = new MyThread();
			Executor.extecute(obj);
		}
		ExecutorService.shutdown();
	}
 }
