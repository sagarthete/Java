// by this code we can imagine the diagram of single object for two classes
 class Parent{
   
       int x = 100;

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
       void gun(){
       
         Child obj = new Child();
	 System.out.println(obj.x);
	 System.out.println("in gun method");
       }
      
 }

 class Client{
 
       public static void main(String args[]){
       
             Child obj = new Child();
	     obj.fun();
	     obj.gun();
       }
 }
 
