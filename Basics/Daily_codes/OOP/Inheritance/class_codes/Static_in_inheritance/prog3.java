

 class Parent{
 
       static int x = 10;

       static {
       
         System.out.println("in parent static block");
       }

       static void access(){
       
         System.out.println("in access method");
         System.out.println(x);

       }
 }
 
 class Child extends Parent{
 
       static{ 
           
        Child obj = new Child();   
	       
       }
       Child(){
       
         System.out.println("in Child Constructor");
       }

   public static void main(String args[]){
       
        Child obj = new Child();   
       
    }
 }
