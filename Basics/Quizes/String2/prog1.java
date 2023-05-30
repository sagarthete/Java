  
  class C2W {
  
      public static void main(String args[]){
       
         String s1 = "Core2Web";
	 String s2 = "Techologies";

	 if(s1 == s1.concat(s2)){
		 System.out.println("hey");
	 
     
	 }else if(s1 == s1.concat(s2)){
	 
		 System.out.println("hii");
	     
	 }
	 else{
	 
		 System.out.println(System.identityHashCode(s1));
		 System.out.println(System.identityHashCode(s2));
		 System.out.println(System.identityHashCode(s1.concat(s2)));
	
		 System.out.println("bye");
	         
	 }
      }
   
  }
