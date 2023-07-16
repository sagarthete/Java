//devide by zero
// here Default Exception handler handles exception and generate exception in the formatas...
// 1) thread name 2) exception name 3) description of exception 4)stack trace
  
import java.io.*;

  class Demo{
  	
	  public static void main(String args[])throws IOException{
	  

		int sal = 100000;
	  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number to devide salary");
		int num = Integer.parseInt(br.readLine());

		int result = sal/num;

		System.out.println("your divided salary is "+result);

	  }
  
  }
