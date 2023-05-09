// take character array from user and print vowels
   
   import java.util.Scanner;
   class ArrayDemo{
    
            public static void main(String sagar[]){
	    
	           Scanner s = new Scanner(System.in);
		   System.out.println("enter size");
		   char arr[] = new char[s.nextInt()];

		   System.out.println("enter the charactors");

		   for(int i= 0;i<arr.length;i++){
		   
		      arr[i] = s.next().charAt(0);
		   }
		   System.out.println("vowels are");
		   for(int i=0;i<arr.length;i++){
		      
		      if(arr[i]=='A'||arr[i]=='a'){
		        System.out.println(arr[i]);

		      }
		      if(arr[i]=='E'||arr[i]=='e'){
		        System.out.println(arr[i]);
		      }       
		      if(arr[i]=='I'||arr[i]=='i'){
		        System.out.println(arr[i]);
		      }       
		      if(arr[i]=='O'||arr[i]=='o'){
		        System.out.println(arr[i]);
		      }       
		      if(arr[i]=='U'||arr[i]=='u'){
		        System.out.println(arr[i]);
		      }       
		    
   		   }
	     
	    }
   }
