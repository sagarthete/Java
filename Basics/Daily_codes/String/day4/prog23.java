//split(); 
    import java.io.*;
    class StringDemo{
                 
	         static String[] mySplit(char[]arr,char ch){
		        
			int count = 0;
		        for(int i=0;i<arr.length;i++){
			   if(arr[i]==ch && i<=arr.length-1)
			     count++;
			 }
			String sarr[] = new String[count+1];
		               int num = 0;	  

			      for(int j=0;j<arr.length;j++){
			          
			          if(arr[j]!=ch){
				    sarr[num] = sarr[num]+ch;
				  }
				  else{
				     num++;
				  }
			      }
		            return sarr;   	      
			}
		 
		 

          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("enter the string");
		 String str1 = br.readLine();
		 System.out.println("enter Delimeter");
		 char ch = br.readLine().charAt(0);
	 	 
                 char arr[] = str1.toCharArray();
                 
                 String []sarr = mySplit(arr,ch);
                   for(int i = 0;i<sarr.length;i++){
		      System.out.println(sarr[i]);
		   }		 
		}
	  }
    
    
