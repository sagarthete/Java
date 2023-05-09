//BufferedReader 

   import java.io.*;
    
       class BufferRDemo{
       
             public static void main(String sagar[])throws IOException{
	            
		    InputStreamReader isr = new InputStreamReader(System.in);
	            BufferedReader br = new BufferedReader(isr);
		    System.out.println("enter name");
                    String name = br.readLine();

		    System.out.println("name entered is "+ name);
	     }
       
       }
