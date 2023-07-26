
  class MyThread extends Thread{
        int x = 0;
  	public void run(){
	        
		x++;
		for(int i = 0;i<5;i++){
		
			System.out.println("in run method: "+x);
		}
	}
  }
  class ThreadDemo{
  
  	public static void main(String args[]){
	
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());

		MyThread obj1 = new MyThread();
		System.out.println(obj1.getPriority());

		t.setPriority(7);
		
		MyThread obj2 = new MyThread();
		System.out.println(obj2.getPriority());

	}

  }	

