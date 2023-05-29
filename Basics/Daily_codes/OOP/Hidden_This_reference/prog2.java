// this refrence is firat parameter which bring the adress of the created object to the constructor or instance methods
   

   class Demo{
    
         int x = 100;

         Demo(int x){
	     
            System.out.println(this.x); 
            System.out.println(this);              // @1000
            	    
	 }	 
   
	 public static void main(String args[]){
	 
	       Demo obj = new Demo(50);
	       System.out.println(obj);           // @1000
	 } 
    }
