// in this code "super" is used to indicate parents variables
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
       
         System.out.println(x);          // 100
         System.out.println(y);          // 200
         System.out.println(super.y);    // 10
         System.out.println(super.y);    // 20

       }
 }

 class Client{
 
       public static void main(String args[]){
       
            Child obj = new Child();
	    obj.access();
       }
 }
