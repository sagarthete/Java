
class MyThread extends Thread{

	public void run(){
	
		for(int i = 0;i<5;i++){
		
			System.out.println("in run method");
		}
	}

}

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		MyThread obj = new MyThread();
		obj.start();
	}
 
 }
