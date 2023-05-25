

    class StringDemo{
    
          public static void main(String args[]){
	  
	         String s1 = "abc";
		 StringBuffer s2 = new StringBuffer(s1);
		

		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s2.append(s1));
		 System.out.println(s1.concat(s2));
		
	  
	  }
    
    }
