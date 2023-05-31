  
    import java.io.*;
    class MethodDemo{

          public static void main(String args[])throws IOException{
           
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the Strings"); 
		String s1 = br.readLine();
		String s2 = br.readLine();

		System.out.println(s1.equals(s2));
	  }	  
    }
