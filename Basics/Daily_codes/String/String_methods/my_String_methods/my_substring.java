//substring(); 
    import java.io.*;
    class StringDemo{
    
	         static String mySubstring(char arr[],int st,int end){
		 
		        char arr1[] = new char[end];
			int j=0;
			for(int i=st;i<end;i++){
			    arr1[j] = arr[i];
			    j++;
			}
                        
		      String str = new String(arr1);
		      return str;
		 }   

          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
		 System.out.println("enter the stating index");
                 int st = Integer.parseInt(br.readLine());
		 System.out.println("enter the end index");
                 int end = Integer.parseInt(br.readLine());

		 
		 char arr[] = str1.toCharArray();

		 String str =  mySubstring(arr,st,end);
		 System.out.println(str);
                   
		  

	  }
    
    }
