//lastIndexOf(); 
    import java.io.*;
    class StringDemo{
    
	          static int myLastIndexOf(char arr[],char ch,int ind){
		  
		         for(int i=ind;i>0;i--){
			  
			      if(arr[i]==ch){
			          return i;
			      }
			 }

                         return -1;
		  }      

          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();	 

                 System.out.println("enter character"); 
                 char ch = br.readLine().charAt(0);
                 
		 System.out.println("enter index for search upto");
		 int num = Integer.parseInt(br.readLine());
                 
		 char arr[] = str1.toCharArray();
                 
		 int ind = myLastIndexOf(arr,ch,num); 
                 		 
                 System.out.println(ind);  
	  }
    
    }
