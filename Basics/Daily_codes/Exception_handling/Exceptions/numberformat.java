
//NumberFormatException

 import java.io.*;

 class Demo{
 
 	void getData()throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number");
		int num = Integer.parseInt(br.readLine());

		System.out.println("your entered number is "+num);
	}
 
	public static void main(String args[])throws IOException{
	
		Demo obj = new Demo();
		obj.getData();
	}
 }
