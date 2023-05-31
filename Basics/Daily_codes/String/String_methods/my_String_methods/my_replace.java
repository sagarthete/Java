 //replace();
    import java.io.*;
    class StringDemo{
    
	         static String myReplace(char arr[],char ch1,char ch2){
		 
		        for(int i=0;i<arr.length;i++){
			    if(ch1==arr[i])
				    arr[i]=ch2;
			    
			}
		       String str = new String(arr);
		       return str;
		      
		 }
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
		 
                 
		 System.out.println("enter old character");
		 char ch1 = br.readLine().charAt(0);
		 System.out.println("enter new character");
		 char ch2 = br.readLine().charAt(0);
		 
		 char arr1 [] = str1.toCharArray();
                
		 String s1 = myReplace(arr1,ch1,ch2);
                 System.out.println(s1);

	  }
    
    }
