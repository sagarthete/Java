 // method _sign is reason that we can write mwthods with same name but different parameters
 
  class Demo{
    
        Demo(){
	
	   System.out.println("in no-args constructor");
	}

	Demo(int x){
	
	   System.out.println("in para constructor");
	
	}

	void fun(){
	 
	   System.out.println("in no-args fun");
	}

	void fun(int x){
	   
 	  System.out.println("in para fun");

	}

	public static void main(String args[]){
	
	    Demo obj1 = new Demo();
	    Demo obj2 = new Demo(100);
	    
	    obj1.fun();
	    obj1.fun(200);
	}
	
    }
  
