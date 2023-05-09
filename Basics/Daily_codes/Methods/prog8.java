import java.util.Scanner;   
class Demo{
  
        static void Sub(int a,int b){
	 
	       int ans = a - b;
	       System.out.println("subtraction= "+ans);
	}
        static void Mul(int a,int b){
	 
	       int ans = a * b;
	       System.out.println("multiplication= "+ans);
	}
        static void Div(int a,int b){
	 
	       int ans = a / b;
	       System.out.println("division= "+ans);
	}

	public static void main(String sagar[]){
	 
	        Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		Sub(a,b);
		Mul(a,b);
		Div(a,b);
	}
  

  }
