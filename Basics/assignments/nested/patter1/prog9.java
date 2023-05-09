/*  1C3 4B2 9A1
 *  16C3 25B2 36A1
 *  49C3 64B2 81A1
 */

      class Nested{
      
	   public static void main(String sagar[]){
              
		 int num=1; 
	    for(int i=1;i<=3;i++){
	          char ch = 64+3;
		  int num1 = 3;
	        for(int j =1;j<=3;j++){
		   System.out.printf("%d%c%d ",num*num,ch,num1);
			num1--;
	                ch--;
	                num++;		
		   }
		    System.out.println();
		   }
		   
		
		
	    }
	    
      }
      
      
