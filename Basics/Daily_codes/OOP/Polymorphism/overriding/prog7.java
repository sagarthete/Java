//covariant return type

 class Parent{
 
       Object fun(){
       
          	System.out.println("in object fun method");
		return new Object();
       }
 }

 class Child extends Parent{
 
 	String fun(){
	
		System.out.println("in String fun method");
		return new String();
	}
   
 }

 class Client {
 
      	public static void main(String args[]){
	
	    	Parent obj = new Child();
		obj.fun();	
	}
 }
