
 class Demo{
 
	int x = 10;
 	Demo(){
	
		this(x);
	}
	Demo(int x){
	
		this();
	}
 }

 class Main{
 
 	public static void main(String args[]){
	
		Demo obj = new Demo();
	}
 }
