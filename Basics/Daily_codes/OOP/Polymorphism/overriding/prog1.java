//  normal overriding , in which
//  the Child implement the method of parent class within itself according to its need
//  there must be parent child realtion between them
//  method signature of ovrriden method should be same

  class Parent{

	Parent(){
	
	   System.out.println("in parent constructor ");

	}

        void fun(){
	
	   System.out.println("in parent fun ");
	   
	}

  }

 class Child extends Parent{
 
       Child(){
       
          System.out.println("in Child constructor");
       }

       void fun(){
       
          System.out.println("in Child fun");
         
       }
 }

 class Client{
 
       public static void main(String args[]){
       
           Child obj = new Child();
	   obj.fun();    //call to overriden method
        
       }
 }
