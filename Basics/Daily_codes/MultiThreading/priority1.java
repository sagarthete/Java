
class MyThread extends Thread{

	public void run(){
		
		for(int i = 0;i<5;i++){
			System.out.println("in run of MyThread");
		}
	}
}
class MyClass extends Thread{

	public void run(){
	
		for(int i = 0;i<5;i++){
			System.out.println("in run of MyClass");
		}
		
	}
}

 class ThreadDemo{
 
 	public static void main(String args[]){
	
		MyThread obj1 = new MyThread();

		MyClass obj2 = new MyClass();

		obj1.setPriority(7);
		obj2.setPriority(3);

		obj1.start();
		obj2.start();

	}
 }
