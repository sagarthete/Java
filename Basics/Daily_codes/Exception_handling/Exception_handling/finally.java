
import java.io.*;
class Demo{

	public static void main(String args[])throws IOException{
	
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        System.out.println("enter string 1");
	        String str1 = br.readLine();
	        
	       	br.close();

		try{
		
	        	System.out.println("enter string 2");
	        	String str2 = br.readLine();
			
		}	
		catch(IOException obj){
		
			System.out.println("here");
		}
		finally{
		
			System.out.println("in finally block");
		}

		System.out.println("end main");
	} 
}
