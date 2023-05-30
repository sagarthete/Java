
  class Demo{
  
       Demo(){
       
           System.out.println("in Demo Constructor");
           User obj = new User();
       }

       void fun(){
       
           System.out.println("in fun method");
          
       }
       
    }
   
   class User{
   
         User(){
	  
	    System.out.println("in User constructor"); 
	 }

         public static void main(String args[]){
	 
	      Demo obj = new Demo();
	      obj.fun();
	 }
   }
