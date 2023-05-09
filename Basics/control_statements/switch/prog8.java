  
      class SwitchDemo{
      
            public static void main(String sagar[]){
	     
	           int ch = 65;

		   switch(ch){
		   
		      case 'A':
			     System.out.println("int case A");
			     break;
		      case 65:
			     System.out.println("int case 65");  // error : duplicate case lable : as character internally goes as is                                                                                                  asckey value                   
		             break;
		      case 'B':
			     System.out.println("int case B");
			     break;
		      case 66:
			     System.out.println("int case 66");
			     break;
		      default:
		             System.out.println("no match");
			     break;	     
		   }
	    }
      }
