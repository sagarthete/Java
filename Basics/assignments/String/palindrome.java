    import java.io.*;
    class StringDemo{
    
          static boolean palindrome(String str){
	   
	         char arr[] = str.toCharArray();
                 
	          for(int i = 0;i<arr.length/2;i++){
		    
		      if(arr[i]!=arr[arr.length-1-i])
		      
		           return false;
		      
		  }	 
	         return true;
	  }
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("enter String");
		 String str = br.readLine();
                 
	         boolean val = palindrome(str);
		 
		 if(val==true)
		       System.out.println("String is palindrome");
		 else
		       System.out.println("String is not palindrome");	 
	  }
    }
