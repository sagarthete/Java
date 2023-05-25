
    class C2W{
    
          int x = 10;     // instatce variable: the memory will allocated in constructor , memory for constructer is allocated after                                                 object creation,hence we cannot access 'x' without creating object;

	    C2W(){
	      
	        System.out.println("in Constructor");
	    }      

	   public static void main(String args[]){
	    
	         C2W obj = new C2W();  
	   }
       
    }
