
  // accessing the static variable and methods form another class by class name


    class Company{
    
          static String name = "TATA";
	   
	         int revenue = 20;

		 
	  static void compInfo(){
	  
	         System.out.println("int Company class");
	         System.out.println(name);

          }

     }

    class Emp{
    
         public static void main(String args[]){
	 
	        System.out.println(Company.name);
		Company.compInfo();

	 }
        
    }
