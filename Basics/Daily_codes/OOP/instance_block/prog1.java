
    //instance variables
    
     class InstanceVar{
     
           int x = 10;

	   void fun(){
	    
	        System.out.println("in fun "+ x);

	   }

       }
   
     class User{
     
           public static void main(String args[]){
	   
	          InstanceVar obj1 = new InstanceVar();
	          InstanceVar obj2 = new InstanceVar();
               
		  System.out.println(obj1.x);
		  System.out.println(obj2.x);

		  obj1.x = 20;
		  
		  System.out.println(obj1.x);
		  System.out.println(obj2.x);

	   }
     
     }
