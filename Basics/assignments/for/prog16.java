 //Automorphic reverse
 
  import java.util.Scanner;

   class Auto{
   
         public static void main(String sagar[]){
	 
                Scanner s = new Scanner(System.in);
                System.out.println("enter number");
                int num = s.nextInt();

                 int rev = 0;
	       for(int i=num;i>0;i=i/10){
	         int rem = i%10;
                 rev = rev*10+rem;
	       }
               int temp = num*num;
	       int rev1 = 0;
	      for(int i = num ;i>0; i=i/10){
	           int rem = temp%10;
		   rev1 = rev1*10+rem;
		   temp = temp/10;
              }

	      if(rev==rev1){
	      
	        System.out.println("Automorphic");
	      }
	      else{
	        System.out.println("Not Automorphic");
	      }

	  }
      }
