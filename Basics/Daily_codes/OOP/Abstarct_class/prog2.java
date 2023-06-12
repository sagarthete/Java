
//

abstract class Parent {

     abstract void fun();

     void gun(){
     
     	 System.out.println("in Parent gun");
     }
}
class Child extends Parent{

      void fun(){
      
      	System.out.println("in Child Fun");
      }  
}

class Client{

	public static void main(String args[]){
	 
		Parent obj = new Child();   // reference of parent can be given 
		obj.fun();
		obj.gun();
	}

}
