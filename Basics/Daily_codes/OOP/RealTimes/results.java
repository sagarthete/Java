
    class Success{
    
          boolean efforts = true;       
	  int no_of_trails = 10;        

	  static String result = "successful";  //can be seen by all;

	  void lookStatus(){
	  
	       System.out.println("efforts = " +efforts);
	       System.out.println("no_of_trails = " +no_of_trails);
	       System.out.println("result = " +result);
	  }
    }

   class Society{
   
         public static void main(String args[]){
	 
	        Success person1 = new Success();
	        Success person2 = new Success();

		person1.lookStatus();
		person2.lookStatus();

		System.out.println("---------------");
		System.out.println("---------------");

		person2.efforts = false;
		person2.no_of_trails = 5;
		person2.result = "failure";
		
		person1.lookStatus();
		person2.lookStatus();

	 }
   
   }
