// Parent obj = new Child();  <=== scenario (2) for this line

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

       void fun(int x){
       
          System.out.println("in Child fun");
         
       }
 }

 class Client{
 
       public static void main(String args[]){
       
           Parent obj = new Child();
	   obj.fun();    // method of parent will bw inherited in Child class        
       }
 }
