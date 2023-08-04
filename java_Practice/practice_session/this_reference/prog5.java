
 class Demo{
 
	 int x = 100;
 	Demo(){
	
		System.out.println("in constructor");
	}
	void fun(){
	
		System.out.println("in fun");
	}
 }
 
 class Main{
 	
	 public static void main(String args[]){
	 
	 	Demo obj = new Demo();
		System.out.println(obj.super.x);
	 }
 
 }
