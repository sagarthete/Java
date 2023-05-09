//lastIndexOf(char ch,int upto); 
    import java.io.*;
    class StringDemo{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str = br.readLine();
                 
		 char ch =br.readLine().charAt(0);
		 int upt = Integer.parseInt(br.readLine());

		 System.out.println("index is:- "+str.lastIndexOf(ch,upt));
	  }
    
    }
