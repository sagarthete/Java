  import java.util.Scanner;
    
   class SwitchDemo{
   
         public static void main(String sagar[]){
	 
	         Scanner s = new Scanner(System.in);
		 System.out.println("enter number");
		 int x = s.nextInt();
                 
	       switch(x){
	       
	           case 1:
			  System.out.println("one");
			  break;
	           case 2:
			  System.out.println("two");
			  break;
	           case 3:
			  System.out.println("three");
			  break;
	           case 4:
			  System.out.println("four");
			  break;
	           case 5:
			  System.out.println("five");
			  break;
	           default:
	                  System.out.println("no match");		  

	       
	       }  	 
         }
   }
