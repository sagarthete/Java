
  class Core2Web{
  
        public static void main(String args[]){
	
	    System.out.println("in main method");
	
	  StringBuffer sb = new StringBuffer();

	  System.out.println(sb.capacity());
	  System.out.println(sb.length());

	  sb.append("qwertyuiopasdfghj");
	  
	  System.out.println(sb.capacity());
	  System.out.println(sb.length());
	   
	  sb.append("qwertyuiopasdfghjklzxcvbnm");

	  System.out.println(sb.capacity());
	  System.out.println(sb.length());

	}
  }
