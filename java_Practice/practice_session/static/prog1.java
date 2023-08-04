
   class Demo{
   
   	void fun(){
	
		System.out.println("in fun");
	}

	void gun(){
	
		System.out.println("from gun : ");
		Demo.fun();
	}
   }
 
 class MainMethod{
 
	 static void run(){
	 
		 Demo.fun();
	 }
 	 public static void main(String args[]){
	
		Demo obj = new Demo();
		MainMethod.run();	
	 }
 }
