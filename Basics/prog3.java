//to show that cannot write anything outside the main method without creating object of class ;
//or without declaring them as sattic
  
  class Demo{
  
        int x = 10;    
	 
        void fun(){
	
	  System.out.println("in function");

	}

	public static void main(String [] args){
	
	       int y = 20;
             
               System.out.println(x); //error
               System.out.println(y);

	      fun(); //error
	}
  
  }
