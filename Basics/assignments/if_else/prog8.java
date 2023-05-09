// to check day of week

  import java.util.Scanner;

   class Days{
        
	 public static void main(String [] args){
	 
	      Scanner s = new Scanner(System.in);
	      System.out.println("enter day number");
	      int num = s.nextInt();
     
              if(num>7 || num <= 0){
	       System.out.println("invalid input");
	      }
              else if(num==1){
	        System.out.println("monday");
	      }
	      else if(num==2){
	        System.out.println("tuesday");
	      }
	      else if(num==3){
	        System.out.println("wednesday");
	      }
	      else if(num==4){
	        System.out.println("thursday");
	      }
	      else if(num==5){
	        System.out.println("friday");
	      }
	      else if(num==6){
	        System.out.println("saturday");
	      }
	      else {
	        System.out.println("sunday");
	      }
	     
	 }
   
   }
