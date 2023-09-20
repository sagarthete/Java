import java.io.*;

	class Write{
	
		public static void main(String args[])throws IOException{
		
			File f1 = new File("vaibhav.txt");

			FileWriter fw = new FileWriter(f1);

				fw.write("sagar");
				fw.write("pranav");	
				fw.write("vaibhav");
				
				fw.write("sagar\n");
				fw.write("pranav\n");	
				fw.write("vaibhav\n");

				fw.close();
		}
	
	}
