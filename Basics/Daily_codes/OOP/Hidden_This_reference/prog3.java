
  // every instance method has also first parameter of this reference

   class Demo{
   
         int x = 100;

         Demo(){
	   System.out.println(this.x);
	   System.out.println("in constructor");
	 }
        
	 void fun(int x){
	 
	    System.out.println("in fun method"); 
	    System.out.println("x = "+x);
	    System.out.println("this = "+this.x);
	 }

	 public static void main(String args[]){
	 
	     Demo obj = new Demo();
	     obj.fun(10);
	 }
   }
