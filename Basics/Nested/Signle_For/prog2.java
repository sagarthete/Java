/* A B C 
 * A B C 
 * A B C
 */
    
 class Nested{
  
       public static void main(String sagar[]){
       
              char ch = 'A';

	      for(int i = 1;i<=9;i++){

		      if(i%3==0){
		      
		        System.out.print(ch + " ");
			System.out.println();
			ch = 'A';
		      }
		      else{
		        System.out.print(ch+" ");
			ch++;
		      }
	      }
       }
 }

