// when we create the object of the child class the then then execution sequence will be 
// 1.parent static block 2.child static block 3. the further object creation and all

class Parent{

      static{
      
          System.out.println("in parent static block");
      }
}

class Child extends Parent{


      static{
      
          System.out.println("in child static block");
        }
}

class Client {

      public static void main(String args[]){
      
             Child obj = new Child();
      }

}
