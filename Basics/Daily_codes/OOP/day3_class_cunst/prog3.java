
   class Macdie{
   
        int item = 5;
	String prod = "Fries";

	void menu(){
	
	    String menu1 = "veg";
	    String menu2 = "nonveg";
	
	    System.out.println(item);
	    System.out.println(prod);
	}
   }
   
  class User{
  
        public static void main(String args[]){
	 
	       Macdie obj = new Macdie();
	       obj.menu();
	}
    
  }
