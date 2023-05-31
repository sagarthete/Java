 // class can have only two access Specifiers
 // 1. default 2. public
  
     class Demo{                                 // default access specifier
    
          Demo(){
	  
	    System.out.println("in Demo constructor");
	  }

	  public static void main(String args[]){
	  
	     System.out.println("in main");
	     Demo obj = new Demo();
	  }
    
    }
  
