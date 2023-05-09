 /* F
  * E F
  * D E F
  * C D E F
  * B C D E F
  * A B C D E F
  */
      import java.util.Scanner;
      class Nested{
       
            public static void main(String sagar[]){
	          
	              Scanner s = new Scanner(System.in);
		      System.out.println("enter rows");
		      int row = s.nextInt();
                      System.out.println();
		       char ch = (char)(64+6);
		     for(int i = 1;i<=row;i++){
		       char ch1 = ch; 
		         for(int j =1;j<=i ;j++){
			    
			     System.out.print( ch1+" ");
			     ch1++;
			  }
			  ch--;
			 System.out.println();
		     } 
                   
		      
		  }
	    } 
      
