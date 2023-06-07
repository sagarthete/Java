

  class Parent{
  
       Parent(){
        
          System.out.println("in parent constructor");

       }
  }

  class Child extends Parent{                       
      Child(){
        Parent obj = new Parent();  
        System.out.println("in child constructor");
      
      }
  }
 
  class Client{
  
       public static void main(String args[]){
        
             Child obj = new Child(); 
       }
  }
