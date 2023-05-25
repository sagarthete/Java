//InitialCapacity;

   
     class SBDemo{
     
           public static void main(String args[]){
	   
	         StringBuffer sb = new StringBuffer(10);

		  sb.append("Shashi");

		  System.out.println(sb);
		  System.out.println(System.identityHashCode(sb));
		  System.out.println(sb.capacity());
		 
		  sb.append("Bagal");
		  
		  System.out.println(sb);
		  System.out.println(System.identityHashCode(sb));
		  System.out.println(sb.capacity());
             
	   }
     
     }
   
