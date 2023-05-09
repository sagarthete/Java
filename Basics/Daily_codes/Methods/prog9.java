import java.util.Scanner;   
class Demo{
        void Add(int a,int b){
	 
	      // int ans = a + b;
	       System.out.println("addition= "+(a+b));
	}
  
        void Sub(int a,int b){
	 
	       int ans = a - b;
	       System.out.println("subtraction= "+ans);
	}
        void Mul(int a,int b){
	 
	       int ans = a * b;
	       System.out.println("multiplication= "+ans);
	}
        void Div(int a,int b){
	 
	       int ans = a / b;
	       System.out.println("division= "+ans);
	}

   	public static void main(String sagar[]){
	          
	        Demo obj = new Demo();	
	        Scanner s = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
	        obj.Add(a,b);
		obj.Sub(a,b);
		obj.Mul(a,b);
		obj.Div(a,b);
	}
  

  }
