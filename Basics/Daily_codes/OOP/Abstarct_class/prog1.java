// if there is any method in class without defination then method is called abstract method
// and this class will be abstarct class
// method and class must be start with abstarct keyword to define them abstract
// abstract class never be instantiated(object will never be created because it is incomplete);

abstract class Parent {

     abstract void fun();
}
class Child extends Parent{

      void fun(){
      
      	System.out.println("in Child Fun");
      }  
}

class Client{

	public static void main(String args[]){
	
	//	Parent obj1 = new Parent();  // error: 
		Parent obj2 = new Child();   // 
	}

}
