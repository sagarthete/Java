//startsWith(); 
    import java.io.*;
    class StringDemo{
    
                 static boolean myStartsWith(String str1,String str2,int ind){
		 
		        char arr[] = str1.toCharArray();
			char arr1[] = str2.toCharArray();
                         int j = 0;
			 if(ind>arr.length)
				 return false;
			 for(int i=ind;j<arr1.length;i++){
			 
			     if(arr[i]!=arr1[j]){
				    return false;
			      }	
			     j++;     
			 }
			 
			 return true; 
		 
		 }

          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
		 System.out.println("enter prefix");
		 String str2 = br.readLine();
		 
                 System.out.println("enter the number");
		 int ind = Integer.parseInt(br.readLine()); 
		 
		 boolean var1 = myStartsWith(str1,str2,ind);

		 System.out.println(var1);

		 

	  }
    
    }
