//print factorial of given number

  import java.util.Scanner;

  class Factorial{
  
       public static void main(String sagar []){	  
        Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int num = s.nextInt();
         
        int mult=1;	
	 
	if(num==0){
	  System.out.println("0");
	}
	else if(num<0){
	
	     for(int i = num;i<=-1;i++){
	      
	       mult = mult*i;  
	     }
	System.out.println("factorial of the number is "+mult);
	}
	else{
	
	   for(int i=num;i>=1;i--){
	   
	     mult = mult*i;

	   }
	System.out.println("factorial of the number is "+mult);

	}
    } 
}
