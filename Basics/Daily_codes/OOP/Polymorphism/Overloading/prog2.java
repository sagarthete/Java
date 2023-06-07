// method sign

  class Demo{
    
        void fun(int x){
	
	     System.out.println("in fun1 method");
	} 
        void fun(float x){
	
	     System.out.println("in fun2 method");

       }

       public static void main(String args[]){
       
             Demo obj = new Demo();
	     obj.fun(10);
	     obj.fun(10.5f);
       }
  }
