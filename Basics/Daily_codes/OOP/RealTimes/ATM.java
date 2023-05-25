   
   import java.io.*;
   class ATM{
   
         int pin ;
         String BankName = "HDFC";
	 void Credit()throws IOException{
	      
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	      System.out.println("enter amount to credit");
              int amount = Integer.parseInt(br.readLine()); 
	      
	      System.out.println("enter pin");
               pin = Integer.parseInt(br.readLine()); 
	 
	      System.out.println(amount+" is credited");
	 }
	  
	 void Debit()throws IOException{
	       
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	      System.out.println("enter amount you want to debit");
	      int amount = Integer.parseInt(br.readLine());
	      
	      System.out.println("enter pin");
	      pin = Integer.parseInt(br.readLine());

	      System.out.println(amount+" is debited");  
	 }
	  
	 public static void main(String args[])throws IOException{
	 
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	       ATM obj = new ATM();

	       obj.Credit();
	       obj.Debit();
	 }
   }
