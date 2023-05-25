
  class Demo{
  
        int num = 10;
	static int num2 = 20;

	void fun(){
	   
             System.out.println(num);
             System.out.println(num2);
          	     
	}
  
  }

  class Demo2{
	  
	public static void main(String args[]){
	
	    Demo obj1 = new Demo();
	    Demo obj2 = new Demo();
 
	    obj1.fun();
	    obj2.fun();

            obj1.num = 100;
	    obj1.num2 = 200;

	    obj1.fun();
	    obj2.fun();

	}  
  }
