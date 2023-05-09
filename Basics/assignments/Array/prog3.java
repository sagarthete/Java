/*take array from user and count the even and odd elements
 */
   import java.util.Scanner;
   class ArrayDemo{
   
       public static void main(String sagar[]){
        
              Scanner s = new Scanner(System.in);
	      System.out.println("enter the size");
              
	      int size = s.nextInt();

	      int arr[]= new int [size];
              int sum1=0;
	      int sum2=0;
	      System.out.println("enter elements");
	      for(int i=0;i<arr.length;i++){
	         arr[i] = s.nextInt(); 
                    if(arr[i]%2==0)
		      sum1 = sum1+arr[i];
		    else
		      sum2 = sum2+arr[i];	    
	      } 

              System.out.println("sum of even numbers are:- "+sum1);
              System.out.println("sum of odd numbers are:- "+sum2);

	     
       }
   }
