
// NullPointerException

  class Demo{
  
	  void m1(){
	  
	  	System.out.println("in m1 method");
		

	  }
	  void m2(){
	  
	  	System.out.println("in m2 method");

	  }

	  public static void main(String args[]){
	  
	  	Demo obj = new Demo();
		obj.m1();
		obj = null;
		obj.m2();     // NullPointerException	
	  }
  
 }
