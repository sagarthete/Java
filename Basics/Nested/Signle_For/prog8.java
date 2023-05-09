//A 1 B 2 
//A 1 B 2
//A 1 B 2
//A 1 B 2

     class Nested{
     
           public static void main(String sagar[]){
	   
	           int num = 1;
		   char ch = 'A';
		   int flag = 0;
		   int row = 4;
		   int count = 0;
		 for(int i = 1;i<=row;i++){
		     if(flag==0){
		       System.out.print(ch+" ");
		       ch++;
		       flag = 1;
		     }
		     else{
		      System.out.print(num+" ");
		      num++;
		      flag = 0;
		     } 
		   if(i==row){
		     System.out.println();
		     i=0;
		     ch ='A';
		     num = 1;
		     count++;
		   }
		 if(count==row){
		   break;
		  }  
		 }
	   }
     }
