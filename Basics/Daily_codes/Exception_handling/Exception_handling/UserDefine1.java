import java.util.Scanner;
class Demo{

	public static void main(String args[]){
	
		Scanner sc  = new Scanner(System.in);

		System.out.println("enter the number");

		int x = sc.nextInt();

		try{
		
			if(x==0){
				throw new ArithmeticException("devide by zero");
			}
			System.out.println(10/x);
		}
		catch(ArithmeticException ae){
		
			System.out.println(ae.toString());	
		}
	
	}

}
