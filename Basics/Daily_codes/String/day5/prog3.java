class SBDemo{

      public static void main(String args[]){
      
            StringBuffer sb = new StringBuffer("Sagar");

	     System.out.println(System.identityHashCode(sb));

	     
	     sb.append("thete");

	     System.out.println(sb);
	     System.out.println(System.identityHashCode(sb));

      
      }
 

}
