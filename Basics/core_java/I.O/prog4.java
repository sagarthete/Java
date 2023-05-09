 // chaecking BuffurReader AND Rapper class concept;
 
    import java.io.*;
    class BufferDemo{
    
          public static void main(String sagar[])throws IOException{
	         
		 InputStreamReader isr = new InputStreamReader(System.in); 
	         BufferedReader br = new BufferedReader(isr);
		 System.out.println("enter name");
		 String name = br.readLine();
		 System.out.println("name is "+name);
	         
		 System.out.println("enter age");
		 int age = Integer.parseInt(br.readLine());

		 System.out.println("age is "+age);
	  }
      
    }
