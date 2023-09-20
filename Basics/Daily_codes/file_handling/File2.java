 import java.io.*;

 	class CreateFile{
	
		public static void main(String args[])throws IOException{
		
			File f = new File("sagar");
			
			f.createNewFile();
			
			System.out.println(f.canWrite());
			System.out.println(f.canRead());
			System.out.println(f.isFile());
			System.out.println(f.isDirectory());
			System.out.println(f.length());

			
		}
	}
