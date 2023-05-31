  
    import java.io.*;
    class MethodDemo{

          public static void main(String args[])throws IOException{
           
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the Strings"); 
		String s1 = br.readLine();
		String s2 = br.readLine();

	        String arr[] = s1.split(" ");

		for(int i=0;i<arr.length;i++){
		 
		        System.out.println(arr[i]);	 
		}
	  }	  
    }
