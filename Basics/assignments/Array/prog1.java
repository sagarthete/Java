/* take array from user and print the sum of all elements
 */

    import java.io.*;
    class ArrayDemo{
    
          public static void main(String sagar[])throws IOException{
	  
	         BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		 System.out.println("enter the size of elememnts");
		 int size = Integer.parseInt(br.readLine());

		 int arr[] = new int[size];

		 System.out.println("enter the elements");
                 int sum = 0;
		 for(int i=0;i<arr.length;i++){
		    arr[i] = Integer.parseInt(br.readLine()) ;
                    sum = sum+arr[i];
		 }
		 System.out.println("sum of array elements are:- "+sum);
	  }
    }
