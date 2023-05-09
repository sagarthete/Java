 //chaecking internal
   
   class ArrayDemo{
   
         public static void main(String args[]){
	 
	        int arr[][] = new int[2][3];
	        int num=0;
	      for(int i=0;i<arr.length;i++){
		      
	          for(int j=0;j<arr[i].length;j++){
		      
		      num = num+10;	  
		      arr[i][j] = num;	  
		  }
	      }
	      for(int i=0;i<arr.length;i++){
		      
	          for(int j=0;j<arr[i].length;j++){
		      
		   System.out.print(arr[i][j]+" ");	  
		  }

	       }
	      System.out.println();
	      }	
	 }
   
