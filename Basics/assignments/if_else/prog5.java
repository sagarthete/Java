//according to moth number print days in that month

  import java.util.Scanner;

  class Month{
  
       public static void main(String [] args){
       
	      int month;
              Scanner s = new Scanner(System.in);
	      System.out.println("enter month number");
              month = s.nextInt();

	      if(month < 1 || month > 12){
	       System.out.println("invalid month number");
	      }
              else if(month == 1){
	        System.out.println("january has 31 days");
	      }
              else if(month == 2){
	        System.out.println("february has 28 days");
	      }
              else if(month == 3){
	        System.out.println("march has 31 days");
	      }
              else if(month == 4){
	        System.out.println("april has 30 days");
	      }
              else if(month == 5){
	        System.out.println("may has 31 days");
	      }
              else if(month == 6){
	        System.out.println("june has 30 days");
	      }
              else if(month == 7){
	        System.out.println("july has 31 days");
	      }
              else if(month == 8){
	        System.out.println("augast has 31 days");
	      }
              else if(month == 9){
	        System.out.println("september has 30 days");
	      }
              else if(month == 10){
	        System.out.println("october has 31 days");
	      }
              else if(month == 11){
	        System.out.println("november has 30 days");
	      }
	      else {
	        System.out.println("december has 31 days");
	      }



       }


  }
