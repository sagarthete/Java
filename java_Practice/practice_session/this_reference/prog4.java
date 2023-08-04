
 class Demo{
 
	Demo(){
	 
	 
	}
 	Demo(Demo obj){
	
		System.out.println(obj);
		System.out.println(this);
	}
	void fun(){
		System.out.println("in fun");
	}
 }
 
 class Main{
 
 	public static void main(String args[]){
	
		Demo obj = new Demo();
		Demo obj1 = new Demo(obj);
		obj1.fun();
	}
 }
