   class SwitchDemo{
   
         public static void main(String sagar[]){
	 
	        int x = 2;

		switch(x){
		
		    case 1:
			  System.out.println("one");
		           break;
		    case 2:
			  System.out.println("two");
		           break;
		    case 1:
			  System.out.println("three");   // 1 error : duplicate case lable
		           break;
		    case 4:
			  System.out.println("four");
		           break;
		     default:
		          System.out.println("no match");	   
		
		
		}
	 
	 }
   
   }



