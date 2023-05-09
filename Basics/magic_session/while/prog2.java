//program to calculate the factorial of given number

   import java.util.Scanner;

   class Factorial{
   
         public static void main(String [] args){
	 
	        int num;int flag = 0;
		Scanner s=new Scanner(System.in);
	        System .out.println("enter any number");
	        num = s.nextInt();
      		int mult = 1;
   
	        if (num<0){
		
		   while(num<=-1){
		      mult = mult*num;
		      num++;
		      flag=1;
		   }
		}else if(num>=1){	 

                while(num>=1){
		
		    mult = mult*num;
		    num--;
		    flag =1;
		}
	       }
               else{
	        System.out.println("0") ;		
	       }	    
	     if(flag == 1){  
	     System.out.println(mult);
	 }
   }
  }
