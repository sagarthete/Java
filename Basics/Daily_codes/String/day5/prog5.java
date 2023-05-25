  
     class SBDemo{
     
           public static void main(String args[]){
	   
	          StringBuffer sb = new StringBuffer();
                  
                  sb.append("sagarthete");
		  System.out.println(sb.capacity());
		  System.out.println(sb);
		  System.out.println(System.identityHashCode(sb));
                 
		  sb.append("sagarthete");
		  System.out.println(sb);
		  System.out.println(sb.capacity());
		  System.out.println(System.identityHashCode(sb));

		  sb.append("pandharinathKarbhariThete");
		  System.out.println(sb);
		  System.out.println(sb.capacity());
		  System.out.println(System.identityHashCode(sb));

		  sb.append("pammmmmmm");
		  System.out.println(sb);
		  System.out.println(sb.capacity());
		  System.out.println(System.identityHashCode(sb));

		  sb.append("pandharinaththete");
		  System.out.println(sb);
		  System.out.println(sb.capacity());
		  System.out.println(System.identityHashCode(sb));


	   } 
     
     }
