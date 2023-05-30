
  class Core2Web{
  
        public static void main(String args[]){
	
	    System.out.println("in main method");
	
	    String s1 = new String ("core2web");
	    
	    String s2 = new String ("core2web");

	    if(System.identityHashCode(s1).equals(System.identityHashCode(s2)))

		   System.out.println("true");

	    else
		   System.out.println("false");

	}
  }
