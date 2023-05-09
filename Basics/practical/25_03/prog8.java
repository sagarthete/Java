 /* j
  * i h
  * g f e
  * d c b a
  */
      import java.util.Scanner;
      class Nested{
       
            public static void main(String sagar[]){
	          
	              Scanner s = new Scanner(System.in);
		      System.out.println("enter rows");
		      int row = s.nextInt();
                      System.out.println();
		       int num = row*(row+1)/2;
		       char ch = (char)(64+num);
		     for(int i = 1;i<=row;i++){
		        
		         for(int j =1;j<=i ;j++){
			    
			     System.out.print( ch+" ");
			     ch--;
			  }
		
			 System.out.println();
		     } 
                   
		      
		  }
	    } 
      
