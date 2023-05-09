// print that number that are whole square of integer till range

  import java.util.Scanner;

  class demo{
  
      public static void main(String [] sagar){
      
            Scanner s = new Scanner(System.in);
	    System.out.println("enter range");
	    int range = s.nextInt();

	    int i = 1;
	    while(i*i<=range){
	      System.out.println(i*i);
	      i++;
	    }
      }
  }
