
  class Core2Web{
  
        public static void main(String args[]){
	
	    System.out.println("in main method");
	
	    StringBuffer sb = new StringBuffer();

	    for(int i = 0;i<18;i++){
	    
	       sb.append(i);
	    }
	    
	    System.out.println(sb.length());
	    System.out.println(sb.capacity());

	}
  }
