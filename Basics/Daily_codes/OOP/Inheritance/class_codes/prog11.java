
  class Parent{
  
        int x = 10;
        static int y = 20;

        Parent(){
   
         System.out.println("in parent constructor");
        
	}	
  
  }

 class Child1 extends Parent{
 
       int x = 100;
       static int y = 200;

       Child1(){
       
         System.out.println("in Child Constructor");
       }

       void access(){
       
         System.out.println(x);          
	 System.out.println(y);          
         System.out.println(super.y);    
         System.out.println(super.y);    
       }
 }

 class Child2 extends Child1{
 
        void fun(){
	 
	     System.out.println(super.x);
	     System.out.println(super.y);
	}
 }
 class Client{
 
       public static void main(String args[]){
       
            Child2 obj = new Child2();
	    obj.access();
	    obj.fun();
       }
 }
