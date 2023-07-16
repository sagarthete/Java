
 import java.io.*;
 class Demo{
 
   	public static void main(String args[])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the String 1");
		String str1 = br.readLine();

		br.close();
 			
		
		try{
		
			System.out.println("enter the String 2");
			String str2 = br.readLine();
			
		}
		catch(IOException obj){
		
			System.out.println("stream is closed");
		}

		System.out.println("end main");

	}
 }
