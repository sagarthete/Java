class ArrayDemo{

      public static void main(String args[]){
      
             int arr[][] = new int[2][2];
             int arr1[] = new int[]{10,20,30};

	      arr[0][0]=10;
	      arr[0][1]=20;
	      arr[1][0]=30;
	      arr[1][1]=40;

	    System.out.println("adress of arr:- "+arr);
	    System.out.println("adress of arr:- "+arr[0]);    
	    System.out.println("adress of arr:- "+arr[0][1]);
	    System.out.println("adress of arr:- "+arr1);

      }
}
