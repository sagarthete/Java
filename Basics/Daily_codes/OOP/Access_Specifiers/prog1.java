//default:
   class AccessDemo{
   
         int x = 10;
	 String s1 = "Sagar";

	void fun(){
	
	    System.out.println(x);
	    System.out.println(s1);
	} 

	public static void main(String args[]){
	     
		AccessDemo obj = new AccessDemo();
		obj.fun();  
                User obj1 = new User();
	}
   
   }
   
   class User{
	    
	    void gun(){
	     
	         System.out.println("int gun");
		
	     }
   
        public static void main(String args[]){
	 
	        AccessDemo obj = new AccessDemo();
	   	obj.fun();		//we can access the default variable or methods in same folder;same class ,same fil                                                     e, or within defferent files also
	        User obj2 = new User();
	    	obj2.gun();                 
	 }
   
   }
