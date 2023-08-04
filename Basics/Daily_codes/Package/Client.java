
 
  import java.util.Scanner;
  import arithfun.Addition;

  class Clinet{
  
  	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		Addition obj = new Addition(num1,num2);
		System.out.println(obj.add());
	}
  
  }
