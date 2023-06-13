//using static "keyword" also we can define the method(give body to method) in interface
//static method in interface does not take part in inheritance;
//static method cant be inherited in child class;
//static method owns by interface only

  interface Demo{
  
  	static void fun(){
	
		System.out.println("in fun Demo");
	}
  }
  class DemoChild implements Demo{
  
  
  }

  class Client {
  
  	public static void main(String args[]){
	
	  	DemoChild obj = new DemoChild();
		obj.fun();	// cannot find Sysmbol error : (method fun is static , not inherited)
	}
  }
