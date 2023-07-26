// we can write the multiple exceptions in the same class by using   " | "  sign.

 import java.util.Scanner;
 class Demo{
 
 	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("enter any nymber");

			int data = 0;
			try{
			
			 	data = sc.nextInt();
			}catch(ArithmeticException | NumberFormatException obj){
			
				System.out.println("multiple exceptions in same class");
			}

			System.out.println(data);
	} 
 }
 
