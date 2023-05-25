
  class Person{

        	static String name = "Sagar";
 
       		static String surname = new String("Thete");

        	static int weigth = 68;

        	static float hight = 171.4f; 

       	static void personalInfo(){
	  
	       	System.out.println(name);
	       	System.out.println(surname);
	       	System.out.println(weigth);
	       	System.out.println(hight);
	 }	 
              

	      void About(){
	           System.out.println("taller and dark");
	      }

  }

  class AskPerson{
  
        public static void main(String args[]){
	
	       Person obj1 = new Person();
	       Person obj2 = new Person();

               obj1.personalInfo();
	       obj2.About();
	}
  }
