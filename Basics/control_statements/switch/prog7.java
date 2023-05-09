  
     class SwitchDemo{
     
           public static void main(String sagar[]){
	   
	          String str = "mon";

		  switch(str){
		  
		     case "mon":
			    System.out.println("monday");  //string is now can be lable from java 1.6 onwards , before 1.6 version it                                                                                                                        was not valid
			    break;
		     case "tue":
			    System.out.println("tuesday");
			    break;
		     default:
			    System.out.println("sunday");
			    break;

		  }
	   }
     
     }
