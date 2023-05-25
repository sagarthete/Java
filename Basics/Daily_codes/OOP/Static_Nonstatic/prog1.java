
    class Demo{
    
          int x = 10;             //will be get allocated  in constructer
	  static int y = 20;      // will be get allocated in static block on method area 
	  static int z = 30;      // will be get allocated in static block on method area 

	  void disp(){
	   
	      System.out.println("x = "+x);
	      System.out.println("y = "+y);
	      System.out.println("z = "+z);
	  }

       }
    
    class User{
       
	  public static void main(String args[]){
	   
	         Demo obj = new Demo();
		 
		 System.out.println(obj.x); 
		 System.out.println(obj.y); 
		 System.out.println(obj.z);

		 System.out.println("in fun"); 
                 obj.disp();
	  }   
    }
