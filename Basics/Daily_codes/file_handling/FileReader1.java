import java.io.*;

	class FileDemo{
	
		public static void main(String args[])throws IOException{
		
			FileReader fr = new FileReader("pranav.txt");

			int data = fr.read();

			while(data!=-1){
			
				System.out.print(((char)data));
				data = fr.read();
			}

			//fr.close();
		}
	}
