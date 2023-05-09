/*using sigle for print
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */

    class Nested{
       
          public static void main(String sagar[]){
	  
	       int num = 1;

	       for(int i = 1;i<=9;i++){
	       
	          if(i%3==0){
		    System.out.print(num++);
		    System.out.println();
		  }
		  else{
		  
		    System.out.print(num + " ");
		    num++;
		  }
	       }
	  }
    }
