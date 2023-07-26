 class MyThread extends Thread{

        public void run(){

		 		
                for(int i = 0;i<5;i++){

                        System.out.println("in thread-0");
                }
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

