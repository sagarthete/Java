// multiple of number till certain range

  import java.util.Scanner;

  class Mult{
  
       public static void main(String [] args){
       
            Scanner s = new Scanner(System.in);
	    System.out.println("enter range first");
	    int range = s.nextInt();
            
	    System.out.println("enter number");
	    int num = s.nextInt();

	    int i=1;
	    while(i<=range){
	     
		if(i % num == 0){
		  System.out.println(i);
		  
		}
              i++;
	        
	    }
       }
  }
