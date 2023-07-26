  
  import java.io.*;
  class Demo{
  
  	public static void main(String args[]){
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		try{
		
			System.out.println("enter any number");
			num = Integer.parseInt(br.readLine());
		}
		catch(IOException ie){
		
			ie.printStackTrace();
			System.out.println("in catch");
		}
		System.out.println(num);
		System.out.println("end main");
	}
  
  }
