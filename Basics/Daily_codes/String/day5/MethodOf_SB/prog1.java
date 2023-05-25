//String reverse();
     
     import java.io.*;
    class StrDemo{
    
	        static String myReverse(char arr[]){
		       
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
		      return str;
		}    

         public static void main(String args[])throws IOException{
	 
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the String");
		String str = br.readLine();
                System.out.println(System.identityHashCode(str));
		char arr[] = str.toCharArray();

		String rev = myReverse(arr);
                System.out.println(System.identityHashCode(rev));
            
		System.out.println(rev);
	 }
    
    }
     
