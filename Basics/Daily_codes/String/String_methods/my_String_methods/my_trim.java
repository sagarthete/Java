 //trim();
    import java.io.*;
    class StringDemo{
           
                 static String myTrim(char arr[]){
		  
			 int num1 = 0;
			 int num2 = 0;

		        for(int i = 0;i<arr.length;i++){
			     if(arr[i]!=' '){
			        num1 = i;
			       break;
			     }
			}
			for(int i = arr.length-1;i>=0;i--){
			    if(arr[i]!=' '){
			       num2 = i;
			       break;
			    }
			}
			char arr1[] = new char[num2-num1+1];
			int j=0;
                           for(int i=num1;i<=num2;i++,j++){
			       arr1[j] = arr[i];
			   }
			   String str = new String(arr1);
			   return str;
		 }
	     
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
	
                 char arr[] = str1.toCharArray();

	         String ret = myTrim(arr);
	        
	         System.out.println(ret);	 
             }    
	  }
