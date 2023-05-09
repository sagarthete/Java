/*      *
 *      * *
 *      * * *
 *
 */

    class Nested{
    
          public static void main(String sagar[]){
	  
		   int count1 = 0;
		   int count2 = 0;
	         for(int i=1;i<=9;i++){
		    
			 if( i%2==0){
			    count1 = count1 + 2;
			    int num1 = 1;
			    if(num1<=count1){
			      System.out.print("* ");
			    }
			    
			 }
			 else if(i%3==0 && i%2==1){
			     count2 = count2+3;
			     int num2 =1;
			     if(num2<=count2){
			      System.out.print("* ");
			      num2++;
			     }
			 }
		       else if(i%3==0){
		         System.out.println();
		       }
		       else{
		         System.out.print("* ");
		       }
		 }
	  }
     
    }
      
