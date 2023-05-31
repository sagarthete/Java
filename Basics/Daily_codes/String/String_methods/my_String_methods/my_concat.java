 //concat();
    import java.io.*;
    class StringDemo{
    
          static char[] myConcat(char arr1[],char arr2[]){
	   
	         char arr3[] = new char[arr1.length+arr2.length];
                 int j=0;
		 for(int i=0;i<arr3.length;i++){
		 
		     if(i<arr1.length){
		        arr3[i]=arr1[i];
		     }
		     else{
		       arr3[i]=arr2[j];
		       j++;  
		     }
		 }
		 return arr3;
	  }

          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
	       	 String str2 = br.readLine();

                 char arr1[] = str1.toCharArray();
                 char arr2[] = str2.toCharArray();

                 char arr3[]=myConcat(arr1,arr2);
                 System.out.println(arr3);		 

	  }
    
    }
