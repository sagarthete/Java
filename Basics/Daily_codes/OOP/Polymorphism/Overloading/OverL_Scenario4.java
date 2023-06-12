// return type does not matter in overloading

 class Demo{
 
       void fun(){
       
          System.out.println("in void fun");

       }

       int fun(){                      // error: fun is already defined in Demo
       
          System.out.println("in int fun");
       }
 
 }
