    import java.io.*;
    class StringDemo{
    
          boolean anagram(String str1,String str2){
	  
	          if(str1.length()!=str2.length()){
		       return false;
		  }

	          char arr1[] = str1.toCharArray();
	          char arr2[] = str2.toCharArray();

	          for(int i=0;i<arr1.length;i++){
		         
		      for(int j=0;j<arr1.length-1;j++){
		         
			 if(arr1[j]>arr1[j+1]){     
			   char temp = arr1[j];
			   arr1[j]  = arr1[j+1]; 
		           arr1[j+1]= temp;   
		         }
			 if(arr2[j]>arr2[j+1]){     
			   char temp = arr2[j];
			   arr2[j]  = arr2[j+1]; 
		           arr2[j+1]= temp;   
		         }
                         
		    }
		  } 
		  
		for(int i=0;i<arr1.length;i++){
		    if(arr1[i]!=arr2[i])
			    return false;
		}  
	     return true;   	  
           }
	   
          
	  public static void main(String args[])throws IOException{
	         
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter two Strigs");
		 String str1 = br.readLine();
		 String str2 = br.readLine();
		 
		 StringDemo obj = new StringDemo(); 
                 
		 boolean val = obj.anagram(str1,str2);
                 
		 if(val==true)
			 System.out.println("String is anagram");
		 else
			 System.out.println("String is not anagram");
	  }
    }
