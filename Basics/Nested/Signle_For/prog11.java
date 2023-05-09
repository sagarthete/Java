//* * * *
//* * *
//* *
//*

    class Nested{
    
          public static void main(String sagar[]){
	          
		  int row = 4;
		  int x= row;
              for(int i=1;i<=x;i++){
	          
		    System.out.print("* ");  

                  if(i==x){
		     System.out.println();
		     x--;
		     i=0;
                     
		 }
		 if(x==0){
		   break;
		 }
	      }
	         
	  }
    }
