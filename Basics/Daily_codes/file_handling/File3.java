 import java.io.*;

 	class CreateFile{
	
		public static void main(String args[])throws IOException{
		
			File obj = new File("Folder1");
			
			obj.mkdir();

			File f = new File(obj,"sagar.txt");
			
			f.createNewFile();

			f.delete();			
		}
	}
