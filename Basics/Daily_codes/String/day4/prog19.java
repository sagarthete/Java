 //endsWith();
    import java.io.*;
    class StringDemo{
    
                 static boolean myEndsWith(String str1,String str2){
		 
		        char arr[] = str1.toCharArray();
			char arr1[] = str2.toCharArray();
                         int num = arr.length - arr1.length;
			 int j = 0;
			 
			for(int i=num;j<arr1.length;i++){
			 
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
		 
		 boolean var1 = myEndsWith(str1,str2);

		 System.out.println(var1);

		 

	  }
    
    }
