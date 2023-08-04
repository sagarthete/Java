
  class Demo{
  
  	Demo(){
	
		System.out.println("in constructor");
	}
	void fun(){
	
		System.out.println("in fun");
	}
	{
		this();
		this.fun();
	}

	public static void main(String args[]){
	
		Demo obj = new Demo();
	}
  }
