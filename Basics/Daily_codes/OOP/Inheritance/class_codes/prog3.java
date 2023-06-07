// we can access the public or default methods directly of parent class
 class Parent{
   
       protected int x = 100;

       Parent(){
        
          System.out.println("in parent constructor");
       }
       
       void fun(){
        
           System.out.println("in fun method");
       }

 }

 class Child extends Parent{
 
       Child(){
       
           System.out.println("in child constructor");
       }
      
 }

 class Client{
 
       public static void main(String args[]){
       
             Child obj = new Child();
	     obj.fun();
       }
 }
 
