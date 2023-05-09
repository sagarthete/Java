//Automorphic

   import java.util.Scanner;
   class Auto{
   
        public static void main(String sagar []){
	
	       Scanner s = new Scanner(System.in);
	       System.out.println("enter number");
	       int num = s.nextInt();
	
	       int flag = 0;
	       int sqr = num*num;

             for(int i = num; i>0 ; i=i/10 ){
	        
	         int rem1 = i % 10;
                 int rem2 = sqr % 10;

		 if(rem1 == rem2){
		    flag = 1;
		    sqr = sqr/10;
		 }
		 else{
		    flag = 0;
		    break;
		 }

	      }
               
                if(flag==1){
		  System.out.println("Automorphic");

		}	
	        else{
		  System.out.println("not automorphic");
               }
   }
   }
