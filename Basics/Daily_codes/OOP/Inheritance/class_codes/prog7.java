// we cannot access the members of child class in parent class
// we can access anything of parent class which in child class which will not private by using this
 class Parent{
   
       int x = 100;

       Parent(){
        
          System.out.println("in parent constructor");
          
       }
       
       int fun(){
        
           System.out.println("in fun method");
          // System.out.println(this.num);     error : cannot find symbol
            return 0;           
       }

 }

 class Child extends Parent{
 
	 int num = 1000;
	 
         Child(){
       
           System.out.println("in child constructor");
	   System.out.println(this.fun());            // error occured if fun will have return type 'void';
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
 
