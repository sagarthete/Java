
  class Demo{
  
          void fun(int x){
	  
	       System.out.println("in fun of one parameter");
	  }

	  void fun(int x , int y){
	  
	       System.out.println("in fun of two int parameter");	  
	  }
	  void fun(float x,float y){
	  
	       System.out.println("in fun of two float parameter");	  
	   
	  }

	  public static void main(String args[]){
	  
	         Demo obj = new Demo();
		 obj.fun(10);
		 obj.fun(10,20);
		 obj.fun(10.5f,11.5f);
	  }
  }
