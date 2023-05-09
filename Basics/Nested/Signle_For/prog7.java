// A 1 B 2
// A 1 B 2
// A 1 B 2

       class Nested{
        
             public static void main(String sagar[]){
	     
	            int num = 1;
		    char ch ='A';
		    int row = 5;
		    int count = 0;
		  for(int i = 1;i<=row;i++){
		  
		         
		            if(i%2==1){
			      System.out.print(ch+" ");
			      ch++;
                            }
			    else{
			      System.out.print(num +" ");
			      num++;
			    }
		      
 			    if(i==row){
			    System.out.println();
			    i = 0;
			    num = 1;
			    ch = 'A';
			    count++;
			} 
		      
		      
		     if(count==row){
		         break;
		     } 
		       
		   }

		}  
	     }
       
       
