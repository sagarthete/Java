// if the overriden method have premittive return types then its compulsory to keep them same in Child and Parent class

  

  class Parent{
  
       void fun(){
	
	   System.out.println("in parent fun");
	}
  }

 class Child extends Parent{
 
       int fun(){
       
          System.out.println("in Child fun");
       }
 }

 class Client{
 
       public static void main(String args[]){
       
           Parent obj = new Child();
	   
	   obj.fun();

       }
  }
