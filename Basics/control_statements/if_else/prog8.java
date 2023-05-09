class metre{

      public static void main(String [] args){
      
              int unit = 120;
              int bill = 0;
	       
	     if(unit<=100){
	       bill = unit * 1;
	       System.out.println(bill);		
	     } 
             else{
	        bill = (unit - 100)*2 +100;
	        System.out.println(bill);		
	     }
      }
}
