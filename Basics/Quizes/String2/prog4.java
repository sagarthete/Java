
  class Core2Web{
  
        public static void main(String args[]){
	
	    System.out.println("in main method");
	
	    StringBuffer s1 = new StringBuffer("Sagar");
	    StringBuffer s2 = new StringBuffer("Sagar");
	
	    if(s1 == s2){
	    
	    System.out.println("equal ==");
	      
	    }
	    if(s1.equals(s2)){
	    
	    System.out.println("equal method");
	    
	    }
	    if(s1.contentEquals(s2)){
	    
	    System.out.println("contentEquals");
	    
	    }
	}
  }
