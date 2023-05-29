// this reference is first parameter of the constructor or instamce methods .
   
     class Demo{
   
           int x = 10;

           Demo(){
	   
	      System.out.println("in no args constructor");
	   }

	   Demo(int x){
	   
	      System.out.println(this.x);                   // this brings the adress of object to constructor
              		   
	      System.out.println("in no args constructor");
	      
	   }

          public static void main(String args[]){
	  
	      Demo obj1 = new Demo();
              Demo obj2 = new Demo(50);
	  }
     }
