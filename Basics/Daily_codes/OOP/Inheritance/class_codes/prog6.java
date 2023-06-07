// we can confirm that the internal call are same as written below
 class Parent{
   
       int x = 100;

       Parent(){
        
          System.out.println("in parent constructor");
          System.out.println(this);

       }
       
       void fun(){
        
           System.out.println("in fun method");
           System.out.println(this);

       }

 }

 class Child extends Parent{
 
       Child(){
       
           System.out.println("in child constructor");
	   System.out.println(this);
       }
             
 }

 class Client{
 
       public static void main(String args[]){
       
             Parent obj1= new Parent(); 
	     Child obj2 = new Child();
	     obj1.fun();              //internal call: fun(obj1);
	     obj2.fun();              //internal call: fun(obj2);
	     
       }
 }
 
