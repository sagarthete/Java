   // to ckeck the bytecode of instance block

    class Demo{
    
	    Demo(){
	    int x = 10;	    // will gwt initialize firstly
            System.out.println(x);
	    
	    } 

          {
	   
	     System.out.println("in instance block 1");
	  }

	  {
	   
	     System.out.println("in instance block 2");
	    
	  }

	  void fun(){
	  
	       System.out.println("in fun method");
	  }

	  public static void main(String args[]){
	  
	         Demo obj = new Demo();
                 System.out.println("in main method");

	  }
    }
   
