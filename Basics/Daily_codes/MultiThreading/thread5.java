
class MyThread extends Thread{

	int x = 10;
	void fun(){
	
		System.out.println(x);
		System.out.println("in fun: "+Thread.currentThread().getName());
		run();
	}

	public void run(){

		System.out.println(x);
	
		System.out.println("in run: "+Thread.currentThread().getName());
		
		fun();	
	}
}

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		MyThread obj = new MyThread();
		obj.start();

		
	}
 }
