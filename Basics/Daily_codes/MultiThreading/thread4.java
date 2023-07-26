
class MyThread extends Thread{

	int x = 0;
	void fun(){
	
		System.out.println("in fun: "+Thread.currentThread().getName());
		run();
	}

	public void run(){

		System.out.println("in run: "+Thread.currentThread().getName());
		x++;
		if(x<2)
	   		fun();	
	}
}

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		MyThread obj = new MyThread();
		obj.start();

	        obj.fun();
	}
 }
