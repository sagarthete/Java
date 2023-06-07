// in this code the nearer one will be accessed
  class Parent{
  
        int x = 10;
        static int y = 20;

        Parent(){
   
         System.out.println("in parent constructor");
        }	
  
  }

 class Child extends Parent{
 
       int x = 100;
       static int y = 200;

       Child(){
       
         System.out.println("in Child Constructor");
       }

       void access(){
       
         System.out.println(x);
         System.out.println(y);
       }
 }

 class Client{
 
       public static void main(String args[]){
       
            Child obj = new Child();
	    obj.access();
       }
 }
