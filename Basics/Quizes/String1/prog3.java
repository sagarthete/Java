
    class ArrayDemo{
    
         public static void main(String args[]){
	 
	      String s1 = new String ("Core2Web");
	      String s2 = new String ("Core2Web");

	      if(s1==s2){
	        System.out.println("true1 ");

	      }
	      if(s1.equals(s2)){
	      
	         System.out.println("truw2 ");
	      }

	      if(s1.hashCode()==s2.hashCode()){
	      
	         System.out.println("true3 ");
	      }
	 
	 }
    }
