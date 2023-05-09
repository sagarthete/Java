/* A 1 B 2
/* A 1 B 2
/* A 1 B 2
/* A 1 B 2
 */

  class Nested{
  
        public static void main(String sagar []){
	
	       
		for(int i = 1;i<=4;i++){
         	       int num = 1;
                       char ch = 'A';
	     
	          for (int j = 1;j<=4;j++){
		  
		    if(j%2!=0){
		     System.out.print(ch + " ");
		     ch++;
		    }
		    else{
		     System.out.print(num+ " ");
		    	num++;    
		    }
	     }
	     System.out.println();
	}
  }
  }
