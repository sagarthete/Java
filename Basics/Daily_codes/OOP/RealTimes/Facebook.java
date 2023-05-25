
    class Instagram{
    
         static String stories = "Posted";   // change can be seen by all
               
	        String message = "hii..";    // messages are  personal;

                void viewProfile(){
		     System.out.println("Stories = "+stories);
		     System.out.println("massage = "+message);
		}		
     
    }

   class UserDemo{
   
         public static void main(String args[]){
	 
	        Instagram profile1 = new Instagram(); 
	        Instagram profile2 = new Instagram(); 

		profile1.viewProfile();
		profile2.viewProfile();

		System.out.println("--------------------");
		System.out.println("--------------------");
		
		profile2.stories = "not_posted";
		profile2.message = "bye..";

		profile1.viewProfile();
		profile2.viewProfile();

	 }
   }
