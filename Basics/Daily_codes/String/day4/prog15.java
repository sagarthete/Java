//equals(); 
    import java.io.*;
    class StringDemo{
    
	         static boolean myEquals(char arr1[],char arr2[]){
		       
			if(arr1.length!=arr2.length){
			      return false;	
		          }
		      if(arr1.length==arr2.length){
		             for(int i=0;i<arr1.length;i++){
			         if(arr1[i]!=arr2[i]){
			             	return false;
				 }
			     }
		      }	     
		      
		          return true;
		        
		 }     

          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the strings");
 		 String str1 = br.readLine();
		 String str2 = br.readLine();
                 
		 char arr1[] = str1.toCharArray();
                 char arr2[] = str2.toCharArray();
  	         	 
                 boolean val = myEquals(arr1,arr2); 
		 System.out.println(val);
	  }
    
    }
