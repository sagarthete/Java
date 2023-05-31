
  class Player{
  
        private int jerNo = 0;
	private String name = null;
        private String name1 = "Virat";
        
	Player(int jerNo,String name){
	
	     this.jerNo = jerNo;
	     this.name = name;

	     System.out.println(System.identityHashCode(this.name));
	     System.out.println(System.identityHashCode(this.name1));
	     System.out.println("in Player constructor");
	}

	void info(){
	
	     System.out.println(jerNo +" = "+name);
	  
	}
    }
   
  class Client{
  
        public static void main(String args[]){
	
	       Player obj1 = new Player(18,"Virat");
	}
    
  }
