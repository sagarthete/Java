//automorphic

  import java.util.Scanner;
  class Auto{
  
        public static void main(String sagar[]){
	
	      Scanner s = new Scanner(System.in);
	      System.out.println("enter number");
	      int num = s.nextInt();
            
	    int count = 0;  
	    int i = num;
	    while(i!=0){
	       count++;
	       i = i/10;
	    } 
	    
	    int mod = 1;

	    for(int j=1;j<=count;j++){
	        mod = mod*10;
	    } 
	     if((num*num)%mod==num){
	       System.out.println("Automorphic");

	     }
	     else{
	       System.out.println("Not Automorphic");
	     
	     }
	}
  }
