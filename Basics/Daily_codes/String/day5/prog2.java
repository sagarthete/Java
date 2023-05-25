
 // StringBuffer capacity();
   
     
        class SBdemo{
	
	      public static void main(String args[]){
	      
	             StringBuffer sb = new StringBuffer("sagar");

		     StringBuffer sb1 = new StringBuffer("sagar");

		     System.out.println(System.identityHashCode(sb));
		     System.out.println(System.identityHashCode(sb1));
	      
	      }
	 
	}
