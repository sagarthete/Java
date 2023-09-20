import java.io.*;


	class FileDemo{
	
		public static void main(String args[])throws IOException{
		
			FileWriter fw = new FileWriter("pranav.txt",true);

			fw.write("sagar");
			fw.write("vaibhav");
			fw.write("sanket");
			fw.write("krushna");

			fw.close();
		}
	}
