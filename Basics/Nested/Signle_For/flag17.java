/* |* * * * 
 * |* * *
 * |* *
 * |*
 * |* *
 * |* * *
 * |* * * *
 */
    import java.util.Scanner;
    class Nested{
          
          public static void main(String sagar[]){
	  
		 Scanner s = new Scanner(System.in);
		System.out.println("enter rows");
	        int row = s.nextInt();	
	        System.out.println(); 
		 int flag = 0;
		 int x1=1;
		 int x2=row;
		 int count = 0;
		if(flag==0){
		for(int i=1;i<=x2;i++){
		    System.out.print("* ");
                 
		  if(i==x2){
		     System.out.println();
		     i=0;
                     x2--;
		  }    
		  if(x2==1){
	            flag = 1;		  
		    break;
		  }
		} 
               }
	
	       if(flag==1){ 
		for(int i=1;i<=x1;i++){
		   
		      System.out.print("* ");
		     
		    if(i==x1){
		       x1++;
		       System.out.println();
		       i = 0;
                       count++;
		    }
		    if(count==row){
		      break;
		    }
		}
		
               }
               
	  }
    }
