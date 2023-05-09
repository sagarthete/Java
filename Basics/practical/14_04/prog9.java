//sum of factorial of all digits of numbers

    import java.io.*;
    class IODemo{
    
          public static void main(String sagar[])throws IOException{
	  
	         BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 System.out.println("enter any number");
		 int num = Integer.parseInt(br.readLine());

		 int rem = 0;
		 int sum = 0;
		 while(num!=0){
		    rem = num%10;
		    int fact = 1;

		      for(int i=rem;i>=2;i--){
		          fact = fact*i;     
		      }
		    sum = sum + fact; 
		   num=num/10; 
		 }
		 System.out.println("sum is:- " +sum);
	  }
    }
