
 class MyThread extends Thread{
 
 	public void run(){
	
		System.out.println("in run method");
	}
 }

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		MyThread obj = new MyThread();
		obj.start();
	
	        for(int i = 0;i<20;i++){
			System.out.println("waiting");
		}
		obj.start();
	}
 }
