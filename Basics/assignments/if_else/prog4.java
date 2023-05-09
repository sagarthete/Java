//print spelling from one to five  
  
  import java.util.Scanner;

   class Spellin{
   
         public static void main(String []args){
	 
              int num;		 
	      Scanner s = new Scanner(System.in);
	      System.out.println("enter number");
	      num = s.nextInt();

	      if(num<=0 || num>5){
	       System.out.println("number is invalid");
	      }
              else if(num==1){
	       System.out.println("one");
	      
	      }
	      else if(num==2){
	       System.out.println("two");
	      }
	      else if(num==3){
	       System.out.println("three");
	      }
	      else if(num==4){
	       System.out.println("four");
	      }
	      else{
	       System.out.println("five");
	      }
         }
    }
