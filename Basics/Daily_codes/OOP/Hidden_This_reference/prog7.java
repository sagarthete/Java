// this reference is also used for calling two constructors by creating single object
// to call the constructor explicitly within the another constructor

   class Demo{
   
         Demo(){
	    this(30);
	    System.out.println("in no-args constructor");
    
	 }

         Demo(int x){
	    
	   this();
	   System.out.println("in para constructor");

	 }

         public static void main(String args[]){
	            
	         Demo obj = new Demo(20);	 
	 }	 
   
   }