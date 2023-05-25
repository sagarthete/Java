//accessing the static variable by class name

    class Student{
    
         static int num = 10;

         static String name = "Sagar";
         
	  static void StudentInfo(){
	  
	         System.out.println(num);
		 System.out.println(name);
	  } 
	  static float flt = 34.89f;
    }

   class User{
   
         public static void main(String args[]){
	 
	        System.out.println(Student.num);
	        System.out.println(Student.name);
	        System.out.println(Student.flt);

		  Student.StudentInfo();
		  
	 }
   }
