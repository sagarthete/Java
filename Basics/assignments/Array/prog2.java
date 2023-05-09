/*take array from user and count the even and odd elements
 */
   import java.util.Scanner;
   class ArrayDemo{
   
       public static void main(String sagar[]){
        
              Scanner s = new Scanner(System.in);
	      System.out.println("enter the size");
              
	      int size = s.nextInt();

	      int arr[]= new int [size];
              int cnt1=0;
	      int cnt2=0;
	      System.out.println("enter elements");
	      for(int i=0;i<arr.length;i++){
	         arr[i] = s.nextInt(); 
                    if(arr[i]%2==0)
		      cnt1++;
		    else
		      cnt2++;	    
	      } 

              System.out.println("even numbers are:- "+cnt1);
              System.out.println("odd numbers are:- "+cnt2);

	     
       }
   }
