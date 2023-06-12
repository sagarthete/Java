// shows that siblings are not compatible to each other
  
class Demo{
   
        void fun(String str){
	
	     System.out.println("String class para");
	}

	void fun(StringBuffer sb){
	
	     System.out.println("StringBuffer class para");
	    
	}
  }

class Client{

      public static void main(String args[]){
      
          Demo obj = new Demo();
	  obj.fun("Sagar");
	  obj.fun(new StringBuffer());

 //	  obj.fun(null);                     :-  error accured because of ambigious call null can pass to both String and SB
      }
}
