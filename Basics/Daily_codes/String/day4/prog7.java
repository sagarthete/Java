//String replace(char old,char new); 
    import java.io.*;
    class StringDemo{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str = br.readLine();
                 
		 char ch =br.readLine().charAt(0);
		 char ch1 =br.readLine().charAt(0);
		 

		 System.out.println(str.replace(ch,ch1));
	  }
    
    }
