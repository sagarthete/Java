 import java.util.Scanner;
class ArrayDemo{

     public static void main(String sagar[]){
         
            Scanner s = new Scanner(System.in);
	    System.out.println("enter size");
	    int size = s.nextInt();

	  int arr[] = new int[size];

          System.out.println("enter array elements");
          for(int i = 0;i<size;i++){
	  
	     arr[i] = s.nextInt();
	  }
	  System.out.println("array elements are");
          for(int i=0;i<size;i++){
	  
	     System.out.println(arr[i]);
	  }	  
     }
} 




