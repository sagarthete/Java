 // mystringCompare();
 
       import java.io.*;
       class StringDemo{
       
             static int myStrCmp(String s1,String s2){
	     
	            char arr1[] = s1.toCharArray();
		    char arr2[]= s2.toCharArray();
         
		    int flag = 0;
                    if(flag==0){
	       	           for(int i=0;i<arr1.length;i++){
			    
			       if(arr1[i]!=arr2[i])
				return arr1[i]-arr2[i];
			        
			    }
			 flag = 1;  
		    }
		    if(flag==1){
		     
		        if(arr1.length!=arr2.length)
			    return arr1.length - arr2.length;
			
			else
			    return 0;
			
		    }

		    return 0;
	     
	     }

             public static void main(String args[])throws IOException{
	     
		     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	             String str1 = br.readLine();
		     String str2 = br.readLine();

		     int ret = myStrCmp(str1,str2);

		     System.out.println(ret);
	     }
       
       }
  
