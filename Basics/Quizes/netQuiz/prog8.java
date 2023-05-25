
     class StringBF{
    
           public static void main(String args[]){
	   
	          StringBuffer sb1 = new StringBuffer ("sagar");
		  StringBuffer sb2 = new StringBuffer ("ragas");
		  StringBuffer sb3 = sb1.reverse();

		  System.out.println(System.identityHashCode(sb1));
		  System.out.println(System.identityHashCode(sb2));
		  System.out.println(System.identityHashCode(sb3));
	    
	   }
    
     }


