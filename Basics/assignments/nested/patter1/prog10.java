/*F 5 D 3 B 1
  F 5 D 3 B 1
  F 5 D 3 B 1
  F 5 D 3 B 1
  F 5 D 3 B 1
  F 5 D 3 B 1
  */
      class Nested{
      
	   public static void main(String sagar[]){
              
		 	 
	    for(int i=1;i<=6;i++){
	         
		 char ch1 = 'F';
		 int num = 5;
	        for(int j =1;j<=6;j++){
		   if(j%2==1){
		   System.out.print(ch1+" ");
		   }
		   else{
		   System.out.print(num+" ");
		    num = num -2;
		   }
		   ch1--;
		
		
	    }
	    System.out.println();
      }
      }
      }
