 class MyThread extends Thread{

        public void run(){

		MyClass obj1 = new MyClass();
		obj1.start();
		try{
			obj1.join();
		}
		catch(InterruptedException ie){}
  		
                for(int i = 0;i<5;i++){

                        System.out.println("in thread-0");
                }
        }
  }

 class MyClass extends Thread{
 
 	public void run(){
	
		MyThread obj2 = new MyThread();
		obj2.start();
		try{
			obj2.join();
		}
		catch(InterruptedException ie){}
		System.out.println("in Thread 1");
	}
 }

 class ThreadDemo{

        public static void main(String args[])throws InterruptedException{

                MyThread obj = new MyThread();

                obj.start();

                obj.join();

                for(int i = 0;i<5;i++){

                        System.out.println("in main method");
                }
        }

 }

