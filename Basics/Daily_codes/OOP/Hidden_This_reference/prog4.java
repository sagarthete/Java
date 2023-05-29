// if there is no local variable instance can be accessed without applying this expicitly . 
// if both local and instance variable are present then without this only we can access local(nearer) variable. 
   
   class Demo{
   
         int x = 100;

	 Demo(){
	 
	    System.out.println("in constructor");
            System.out.println("instance without this "+x);
	 }

	 void fun(int x){
	 
	      System.out.println("in fun method");
	      System.out.println("without this = "+x);

	 }

	 void gun(int x){
	 
	      System.out.println("in gun method");
	      System.out.println("with this = "+this.x);
	 
	 }

	 public static void main(String args[]){
	 
	       Demo obj = new Demo();
	       obj.fun(10);
	       obj.gun(10);
	 }
   }
