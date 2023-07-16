// simple calculator 

  import java.util.Scanner;

  class Calc{
  
   	public static void main(String args[]){
	
		Scanner s = new Scanner(System.in);
		System.out.println("start opration");
		int num1 = s.nextInt();
		
		char ch = s.next().charAt(0);
		int num2 = s.nextInt();

		switch(ch){
		
			case'+':
				
				System.out.println("sum is = "+(num1+num2));
				break;

			case'-':
				
				System.out.println("sub is = "+(num1-num2));
				break;
			case'*':
				
				System.out.println("mult is = "+(num1*num2));
				break;
			case'/':
				
				System.out.println("div is = "+(num1/num2));
				break;
			default:

				System.out.println("illigal opration");

		}

	}
  }
