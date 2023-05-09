

   class StringDemo{
   
         public static void main(String args[]){
	 
	        String str = "sagar";
                  
		 int count = 0;
		 char ch = str.charAt(0);
		for(int i=1; ;i++){
		//char ch = str.charAt(i);	
                    if((ch>=64 && ch <= 90)||(ch>=97 && ch<=122)){
		          System.out.print(ch);
		           count++;
	        //        System.out.println(count);  
	         	 ch = str.charAt(i);	
			   
		    } else{
		          break;
		      }
	      
	         }
	     System.out.println(count);  
	 }
   }
