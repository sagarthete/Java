// newfixedThreadpool();

	import java.util.concurrent.*;
   class MyThread implements Runnable{
   
	        int num;
	   	MyThread(int num){
		
			this.num = num;
		}
   		public void run(){
			
			System.out.println(Thread.currentThread()+"start thread: "+num);
			dailyTask();
			System.out.println(Thread.currentThread()+"end thread: "+num);
		}
		void dailyTask(){
		
			try{
			
				Thread.sleep(60000);
			}catch(InterruptedException ie){
				ie.toString();
			}
		}
   }

  class ThreadDemo{
  
  	public static void main(String args[]){
	
		ExecutorService ser = Executors.newFixedThreadPool(5);

		for(int i = 1;i<=10;i++){
		
			MyThread obj = new MyThread(i);
			ser.execute(obj);
		}

		ser.shutdown();
	}
  }
