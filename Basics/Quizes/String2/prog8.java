
  class Core2Web{
  
        public static void main(String args[]){
	
	    System.out.println("in main method");
	
	    StringBuffer sb1 = new StringBuffer("Shashi");
	    StringBuffer sb2 = new StringBuffer("Shashi");
	
	
	    System.out.println(sb1.equals(sb2));
	    sb1.setLength(3);
	    System.out.println(sb1);
	    System.out.println(sb1.capacity());
	
	    
	}
  }
