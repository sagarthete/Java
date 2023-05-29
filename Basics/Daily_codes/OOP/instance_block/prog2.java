//instance block is a block that is meegerd in the constructor
//this block executes quick after the initialization of instance block
  
    class Demo{
    
          Demo(){
	  
	      System.out.println("in constructor");
	  }     
          {
	  
	       System.out.println("in instance block");

	  }	

	  public static void main(String args[]){
	  
	        Demo obj = new Demo();

		System.out.println("in main");
	  }  
    
    }
