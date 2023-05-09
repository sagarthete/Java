   
      class Switch{
      
            public static void main(String sagar[]){
	    
		   int x = 4; 
	           int a = 1;
		   int b = 2;
		   int c = 3;

		  switch(x){
		  
		      case a :
			     System.out.println("one");  // 3 errors: constant variable required.
							 //          for three variable three error .variable can be changed anytime
			     break;
		      case b :
			     System.out.println("one");
			     break;
		      case c :
			     System.out.println("one");
			     break;
		      case 2 :
			     System.out.println("one");
			     break;
		      case 4 :
			     System.out.println("one");
			     break;

		  } 
	      
	    }
      }
