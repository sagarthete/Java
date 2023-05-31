 //indexOf();
    import java.io.*;
    class StringDemo{
    
	         static int myIndexOf(char arr[],char ch,int st){
		 
		        for(int i=st;i<arr.length;i++){
			    if(ch==arr[i])
				    return i;
			    
			}
		      return -1;
		 }
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
		 
                 
		 System.out.println("enter character");
		 char ch = br.readLine().charAt(0);
		 
		 System.out.println("enter start");
                 int st = Integer.parseInt(br.readLine());

	         char arr1 [] = str1.toCharArray();
                
		 int ind = myIndexOf(arr1,ch,st);
                 System.out.println(ind);

	  }
    
    }
