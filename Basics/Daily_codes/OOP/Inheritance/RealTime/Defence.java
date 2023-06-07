
  class Defence{
  
         String weapons = null;
	 String protection_field = null;

	 void training(String name){
	 
	      System.out.println("taking "+name+ " trainig");
	     // return 0;
	 }
  }

  class Army extends Defence{
  
        Army(String weapons,String protection_field){
	
	    this.weapons = weapons;
	    this.protection_field = protection_field;
	}

	void armyTraining(){
	
	    training("Army");
	    System.out.println(weapons);
	    System.out.println(protection_field);
	}
  
  }
 
  class President{
  
        public static void main(String args[]){
	
	       Army team1 = new Army("panzer","on land");
               team1.armyTraining();	       
	}
  }
