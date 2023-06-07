// Parent obj = new Child();  <=== about this line
 // in this line compiler do check and execute only the given reference of left side, and it searches the method in Parent
 // (of which reference is given), at right side only Syntax checking will be doen
 // at runtime the object of child will be created, and method in object will be called.
  class Parent{

	Parent(){
	
	   System.out.println("in parent constructor ");

	}

        void methodPoly(){
	
	   System.out.println("in parent fun ");
	   
	}

  }

 class Child extends Parent{
 
       Child(){
       
          System.out.println("in Child constructor");
       }

       void methodPoly(){
       
          System.out.println("in Child fun");
         
       }
 }

 class Client{
 
       public static void main(String args[]){
       
           Parent obj = new Child();        // <=== 
	   obj.methodPoly();    //call to overriden method
        
       }
 }
