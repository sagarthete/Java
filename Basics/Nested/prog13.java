/* A 1 A 1
   A 1 A 1
 * A 1 A 1
   A 1 A 1
 */

  class Nested{
  
        public static void main(String sagar []){
	
	       int num = 1;
               char ch = 'A';
	     for(int i = 1;i<=4;i++){
	     
	          for (int j = 1;j<=4;j++){
		   
		if(j%2==0){
		 System.out.print(num+" ");

		}
		else{
		 System.out.print(ch +" ");
		 
		}

	     }
	     System.out.println();
	}
  }

  } 
