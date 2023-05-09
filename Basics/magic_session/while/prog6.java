// to print sum of odd numbers and multiplication of in given range

    import java.util.Scanner;

    class Sum_Mult{
    
	public static void main(String [] sagar){    
         Scanner s = new Scanner(System.in);
         System.out.println("enter start");
	 int start = s.nextInt();
	 System.out.println("enter end");
	 int end = s.nextInt();

	 int sum = 0;
	 int mult = 1;
	 int i = start;

	 if(start>end){
	 
	   System.out.println("invalid input: in RANGE start is always less than end");
	 }
	 else{ 
   		 
	  while(i<=end){
	    
            if(i%2==0){
	      sum = sum + i;
	      i++;
	    } 	 
	    else{
	     mult = mult*i;
	     i++;
	    }
	 }
         System.out.println("sum of even number is "+sum);
         System.out.println("mult of  number is "+mult);

	 
	 }
    }
}
