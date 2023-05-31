//toLowerCase(); 
    import java.io.*;
    class StringDemo{

	         static String myToLowerCase(char arr[]){

                        for (int i = 0;i<arr.length;i++){
			
			    if(arr[i]>64 && arr[i]<91){
			        
			       arr[i] = (char)(arr[i] + 32);
			    }
			} 
		        String str = new String(arr);
		        return str;	
		 
		 }
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
	          
                 char arr[] = str1.toCharArray();

		 String ret = myToLowerCase(arr);

		 System.out.println(ret);
	  }
    
    }
