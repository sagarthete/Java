//oppsite covarient gives error(overriden method must have parent return type)

 class Parent{
 
       String fun(){
       
          	System.out.println("in String fun method");
		return new Object();
       }
 }

 class Child extends Parent{
 
 	Object fun(){                  // error:incompatible types ,Object cannot be converted to String
	
		System.out.println("in Object fun method");
		return new String();
	}
   
 }

 class Client {
 
      	public static void main(String args[]){
	
	    	Parent obj = new Child();
		obj.fun();	
	}
 }
