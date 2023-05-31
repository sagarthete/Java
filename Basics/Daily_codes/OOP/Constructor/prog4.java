// use of constructor :- to bring the data and assign the data to private variable
 
  class Player{
  
        private int jerNo = 0;
	private String name = null;

	Player(int jerNo,String name){
	
	   this.jerNo = jerNo;
	   this.name = name;

	}

	void disp(){
	
	    System.out.println(jerNo+" = "+name);
	
	}

   }

 class Client{
 
       public static void main(String args[]){
       
             Player obj1 = new Player(18,"Virat");
             obj1.disp();
             
	     Player obj2 = new Player(7,"MSD");
             obj2.disp();
             
	     Player obj3 = new Player(45,"Rohit");
             obj3.disp();


       } 
 }

