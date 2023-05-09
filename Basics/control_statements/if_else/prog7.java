class devide{

      public static void main(String [] args){
      
             int num=4;

	     if(num%3==0 && num%5==0){
	        System.out.println("divisible by both");
	     }
	     else if(num%3==0){
	       System.out.println("divisible by 3");

	     }
	     else if(num%5==0){
	       System.out.println("divisible by 5");
	       
	     }
	     else{
	       System.out.println(" not divisible by both");
	       
	     }
      }
}
