// calculate profit or loss

   import java.util.Scanner;

   class Pro_Loss{
   
        public static void main(String [] args){
	
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter cost");
	    int cost = s.nextInt();
	    System.out.println("enter selling price");
	    int sell = s.nextInt();
   
	    int net = sell - cost;

           if(net>0){
	     System.out.println("profit is "+net);
	  
	   }else if(net<0){
	     System.out.println("loss is "+(net)*(-1));
	    
	   }else{
	     System.out.println("no profit no loss");
	   
	   }

	}
   }
