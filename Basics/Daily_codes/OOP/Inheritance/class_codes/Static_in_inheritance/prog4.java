

 class Parent{
 
       int x = 10;
       static int y = 20;

       static {
       
         System.out.println("in parent static block");
       }

       Parent(){
       
         System.out.println("in parent constructosr");
         
       }

       void methodOne(){
       
         System.out.println("in method 1"); 
         System.out.println(x); 
         System.out.println(y); 
       }
       static void methodTwo(){
       
         System.out.println("in method 2");  
         System.out.println(y); 
      }

 }
 
 class Child extends Parent{
 
       static {
       
         System.out.println("in child static block");
       }

       Child(){
       
         System.out.println("in Child constructor");
         
       }
 }

 class Client{
 
       public static void main(String args[]){
       
         Child obj = new Child();   
	 obj.methodOne();
	 obj.methodTwo();
       }
 }
