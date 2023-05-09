import java.io.*;
class ArrayDemo{
  
      public static void main(String sagar[])throws IOException{
      
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("enter the size");
	      int size = Integer.parseInt(br.readLine());
	      int arr[] = new int[size];

	      System.out.println("enter elements");
	      int sum = 0;

	      for(int i=0;i<arr.length;i++){
	          arr[i]=Integer.parseInt(br.readLine());
		  if(arr[i]%2==1){
		    sum = sum+arr[i];
		  }

	      }
	      System.out.println("sum of elememts"+sum);
      }
}
