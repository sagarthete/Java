// in this code we can confirm that the only single object is on heap and child class aslo sends the same adress duri   ng calling parent constructor of that single object, so we can access the members of parent class in same class.
 class Parent{
   
       int x = 100;

       Parent(){
        
          System.out.println("in parent constructor");
	  System.out.println(this);
	  System.out.println(this.x);

       }
       
       void fun(){
        
           System.out.println("in fun method");
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
       
             Child obj = new Child();
	     obj.fun();
	     System.out.println(obj);   
       }
 }
 
