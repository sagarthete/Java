//StringBuffer reverse();
     
     import java.io.*;
    class StrDemo{
    
	        static StringBuffer mySBReverse(char arr[]){
		       
		      int j = 0;
	              int k = arr.length - 1;	      
		      for(int i=0;i<arr.length/2;i++){
		      
		           char ch = arr[j];
			   arr[j] = arr[k];
			   arr[k] = ch;
			   j++;
			   k--;
		      }

		      String str = new String(arr);
		      StringBuffer str1 = new StringBuffer(str);
		      return str1;
		}    

         public static void main(String args[])throws IOException{
	 
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the String");
		StringBuffer str = new StringBuffer(br.readLine());
                
	         char arr[] = str.toString().toCharArray();

		 str = mySBReverse(arr);
                
	         
		System.out.println(str);
	 }
    
    }
     
