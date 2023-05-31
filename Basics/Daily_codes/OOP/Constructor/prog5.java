// setter and getter methods


   class Bank{
   
         private String locker = null;
	 private int no_of_lockers = 0;
     
	 Bank(){
	 
            System.out.println("in Bank");		 
	 }
	 void setValues(String locker , int no_of_lockers){
         
		this.locker = locker;
	        this.no_of_lockers = no_of_lockers;	
	 
	 }
	 void getValues(){
	 
	      System.out.println(locker+" = "+no_of_lockers);
	 }
   }

 class User{
 
       public static void main(String args[]){
       	 
       Bank SBI = new Bank();
       SBI.setValues("available",15);
       SBI.getValues();

       Bank MGB = new Bank();
       MGB.setValues("less_available",5);
       MGB.getValues();

      }
 
 }
