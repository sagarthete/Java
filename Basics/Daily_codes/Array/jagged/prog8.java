
   // taking values from user
    
    import java.io.*;
    class ArrayDemo{
    
          public static void main(String args[])throws IOException{
	  
	         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("enter size");
		 int arr[][] = new int [Integer.parseInt(br.readLine())][];
	  
	        System.out.println("enter size of each row");
     
		 arr[0] = new int[Integer.parseInt(br.readLine())];
		 arr[1] = new int[Integer.parseInt(br.readLine())];
		 arr[2] = new int[Integer.parseInt(br.readLine())];

		 System.out.println("enter elements");
		for(int i=0;i<arr.length;i++){
		
    			for(int j=0;j<arr[i].length;j++){
			
     				arr[i][j] = Integer.parseInt(br.readLine()); 
			}

		}
		for(int [] x:arr){
		
		    for(int y : x){
		    
		      System.out.print(y+" ");
		    }
		    System.out.println();
		}
	  }

    }
