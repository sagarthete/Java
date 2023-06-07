// there is the scenario in this code where the main method come on stack before the static block

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
      
	     System.out.println("in main method");  
             Child obj = new Child();
      }

}
