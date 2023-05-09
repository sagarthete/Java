 
    import java.io.*;
    class StringDemo{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str = br.readLine();
		 int st = Integer.parseInt(br.readLine());
		 int st1 = Integer.parseInt(br.readLine());
                 
		 System.out.println(str.substring(st));
		 System.out.println(str.substring(st,st1));
	  }
    
    }
