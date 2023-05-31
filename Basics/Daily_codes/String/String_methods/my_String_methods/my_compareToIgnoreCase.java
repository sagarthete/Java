 // compareToIgnoreCase();
    import java.io.*;
    class StringDemo{
    
	         static int myCompareToIgnoreCase(char arr1[],char arr2[]){
		 
					 				 	 
			int len = 0;
		        if(arr1.length>arr2.length)
				len = arr2.length;
			else
				len = arr1.length;
			for(int i=0;i<len;i++){
			
			    if(arr1[i]!=arr2[i] && arr1[i]!=arr2[i]+32 && arr1[i]!=arr2[i]-32)
				    return arr1[i] - arr2[i];
			  }
			 if(arr1.length!=arr2.length)
				 return arr1.length-arr2.length;

		      return 0;  	
		 }

		      
	     
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
		 String str2 = br.readLine();

		 char arr1[] = str1.toCharArray();
		 char arr2[] = str2.toCharArray();

		 int ret =  myCompareToIgnoreCase(arr1,arr2);
		 System.out.println(ret);
	  }
    
    }
