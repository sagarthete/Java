class Parent{
  
       static int x = 100; 
       Parent(){
        
          System.out.println("in parent constructor");
	  
       }
       
       static int staticDemo(){
        
           System.out.println("in StaticDemo method");
	   return 0;
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
	     obj.staticDemo();
	     System.out.println(obj.x);   
       }
 }
 
