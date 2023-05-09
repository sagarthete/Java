 //charAt();
    
    import java.io.*;
    class StringDemo{
    
                 static char myCharAt(char arr[],int ind){
		 
		         return arr[ind];
		 }

          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
		 
                 System.out.println("enter index");
	         int ind = Integer.parseInt(br.readLine());	 
                 
		 char arr[] = str1.toCharArray(); 
		 char ch = myCharAt(arr,ind);
		 
		 System.out.println(ch);

	  }
    
    }
