/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 10.
Judge and print total cost for user.*/

    import java.util.Scanner;
      class Discount{
          
	    public static void main(String[]args){
	    
		int total = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("enter quantity");
                int quantity = s.nextInt();
	
		if(quantity>1000){
	      int discount = (quantity*10)/10;
		  total = (quantity*10) - discount;
		  System.out.println("total cost is");
		  System.out.println(total);
		}
		else{
		 total = quantity*10;
		 System.out.println("total cost is");
		 System.out.println(total);

		}
	    }
      
      }
