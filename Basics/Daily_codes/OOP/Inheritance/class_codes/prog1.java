//when we call the constructor of child class the implicitly call goes to parent constructor

  class Parent{
  
       Parent(){
        
          System.out.println("in parent constructor");

       }
  }

  class Child extends Parent{                     // extends: keyword for inherit the properties
  
      Child(){
      
        System.out.println("in child constructor");
      
      }
  }
 
  class Client{
  
       public static void main(String args[]){
        
             Child obj = new Child(); 
       }
  }
