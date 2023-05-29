// this reference is also used for calling two constructors by creating single object
// to call the constructor explicitly within the another constructor
//this call must be always first statement
   
    class Demo{
   
         Demo(){
	 
	    System.out.println("in no-args constructor");
    
	 }

         Demo(int x){
	    
	   this();
	   System.out.println("in para constructor");
          // this();                                     // error : must be first statement 
	 }

         public static void main(String args[]){
	            
	         Demo obj = new Demo(20);	 
	 }	 
   
   }
